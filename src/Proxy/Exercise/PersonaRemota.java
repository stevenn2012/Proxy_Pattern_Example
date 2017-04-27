package Proxy.Exercise;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonaRemota implements Runnable{

	private Thread thread;
	ServerSocket socket;
	PrintWriter salida;
	Socket communicationSocket;
	
	public PersonaRemota(){
		try {
			socket = new ServerSocket(3000);
			communicationSocket = socket.accept();
			salida = new PrintWriter(communicationSocket.getOutputStream(), true);
		} catch (Exception e) {
			
		}
	}

	
	public void run() {
		
	}
}
