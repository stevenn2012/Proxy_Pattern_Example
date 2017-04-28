package Proxy.Variations.Remote.Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//the 'Client' Class
public class MachineMonitor {

	public static void main(String[] args) {
		try {
			MachineStub miMaquina = new MachineStub("127.0.0.1", 3000);
			int op = 0;
			do {
				Thread.sleep(300);
				System.out.println("1. Turn on machine \n2. Turn off machine \n3. View status \n4. Exit ");
				op = readInt();
				switch (op) {
					case 1:	miMaquina.turnOn(); break;
					case 2:	miMaquina.turnOff(); break;
					case 3:	miMaquina.viewStatus(); break;
					case 4:	miMaquina.closeConnection();; break;
					default:break;
				}
			} while (op != 4);
		} catch (Exception e) {
			System.err.println("An error has occurred: "+e.getMessage());
		}
	}
	
	public static String read() throws Exception{
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}
	
	public static int readInt() throws Exception{
		return Integer.parseInt(read());
	}
}
