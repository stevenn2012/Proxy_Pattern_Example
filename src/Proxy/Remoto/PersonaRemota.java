package Proxy.Remoto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonaRemota implements Runnable{

	private Thread thread;
	private ServerSocket socket;
	private PrintWriter salida;
	private Socket communicationSocket;
	
	public PersonaRemota(){
		try {
			socket = new ServerSocket(3000);
			communicationSocket = socket.accept();
			salida = new PrintWriter(communicationSocket.getOutputStream(), true);
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

	private void despedirse() {
		System.out.println("Hola!!!");
	}

	private void decirEstado() {
		System.out.println("Estoy Contento");
	}

	private void saludar() {
		System.out.println("Chao!!!");
	}
}
