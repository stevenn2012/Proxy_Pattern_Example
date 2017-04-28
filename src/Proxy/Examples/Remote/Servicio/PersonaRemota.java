package Proxy.Examples.Remoto.Servicio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonaRemota implements Runnable{

	private Thread thread;
	private ServerSocket socket;
	private Socket communicationSocket;
	
	public PersonaRemota(){
		try {
			System.out.println("Iniciando Servidor");
			socket = new ServerSocket(3000);
			System.out.println("Servidor Iniciado");
			communicationSocket = socket.accept();
			thread = new Thread(this);
			thread.start();
		} catch (Exception e) {
			System.err.println("Ha ocurrido un error (1): "+e.getMessage());
		}
	}
	
	@Override
	public void run() {
		String textoEntrada;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(communicationSocket.getInputStream()));
			while((textoEntrada = in.readLine()) !=  null){
				if(textoEntrada.equals("Saludar")){
					saludar();
				}else if(textoEntrada.equals("decirEstado")){
					decirEstado();
				}else if(textoEntrada.equals("despedirse")){
					despedirse();
				}
			}
		} catch (Exception e) {
			System.err.println("Ha ocurrido un error (2): "+e.getMessage());
		}
	}

	public void saludar() {
		System.out.println("Hola!!!");
	}

	public void decirEstado() {
		System.out.println("Estoy Contento");
	}

	public void despedirse() {
		System.out.println("Chao!!!");
	}
}
