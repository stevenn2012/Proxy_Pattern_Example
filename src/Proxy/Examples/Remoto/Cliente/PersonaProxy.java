package Proxy.Examples.Remoto.Cliente;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class PersonaProxy implements Runnable{

	private Thread thread;
	private Socket socket;
	private InputStream in;
	private PrintWriter salida;
	private int character;
	
	public PersonaProxy(){
		try {
			socket = new Socket("127.0.0.1", 3000);
			System.out.println("Contectando...");
			in = socket.getInputStream();
			salida = new PrintWriter(socket.getOutputStream(), true);
			thread = new Thread(this);
			thread.start();
		} catch (IOException e) {
			System.out.println("Error al conectarse (3): "+e.getMessage());
		} catch (Exception e) {
			System.out.println("Error al general (4): "+e.getMessage());
		}
		
		if(socket != null && socket.isConnected()){
			System.out.println("Conectado");
		}
	}
	
	@Override
	public void run() {
		try {
			while((character = in.read()) != -1){
				System.out.println((char) character);
			}
		} catch (Exception e) {
			System.out.println("Error (5): "+e.getMessage());
		}
	}
	
	public void despedirse() {
		salida.println("despedirse");
	}

	public void decirEstado() {
		salida.println("decirEstado");
	}

	public void saludar() {
		salida.println("Saludar");
	}
}
