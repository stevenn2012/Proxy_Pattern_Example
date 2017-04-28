package Proxy.Variations.Remote.Client;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

import Proxy.Variations.Remote.Subject.SubjectMachine;

//the 'Proxy/Stub' Class
public class MachineStub extends SubjectMachine implements Runnable{
	
	private Thread thread;
	private Socket socket;
	private InputStream in;
	private PrintWriter salida;
	
	public MachineStub(String ip, int port) throws Exception {
		this.socket = new Socket(ip, port); 
		this.in = socket.getInputStream();
		this.salida = new PrintWriter(socket.getOutputStream(), true);
		this.thread = new Thread(this);
		this.thread.start();
	}
	
	@Override
	public void run() {
		try {
			int character;
			while((character = in.read()) != -1){
				System.out.print((char) character);
			}
			System.out.println();
		} catch (Exception e) {
			
		}
	}

	public void turnOn() {
		salida.println("turn_on");
	}
	
	public String viewStatus() {
		salida.println("view_status");
		return "";
	}
	
	public void turnOff() {
		salida.println("turn_off");
	}
	
	public void closeConnection() throws Exception {
		salida.close();
		in.close();
		socket.close();
	}
}
