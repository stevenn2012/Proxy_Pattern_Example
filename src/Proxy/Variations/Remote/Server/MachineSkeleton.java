package Proxy.Variations.Remote.Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//the 'Proxy/Skeleton' Class
public class MachineSkeleton implements Runnable {

	private Thread thread;
	private ServerSocket socket;
	private Socket communicationSocket;
	private Machine machine;
	private PrintWriter salida;
	
	public MachineSkeleton() throws Exception {
		System.out.println("Starting server...");
		this.socket = new ServerSocket(3000);
		System.out.println("Server started");
		this.machine = new Machine();
		this.communicationSocket = socket.accept();
		this.salida = new PrintWriter(communicationSocket.getOutputStream(), true);
		this.thread = new Thread(this);
		this.thread.start();
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Created connection");
			String textoEntrada;
			BufferedReader in = new BufferedReader(new InputStreamReader(communicationSocket.getInputStream()));
			while((textoEntrada = in.readLine()) !=  null){
				switch (textoEntrada) {
					case "turn_on": this.machine.turnOn(); break;
					case "turn_off": this.machine.turnOff(); break;
					case "view_status": this.salida.println(this.machine.viewStatus()); break;
					default: this.salida.println("Option not implemented"); break;
				}
			}
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		try {
			new MachineSkeleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
