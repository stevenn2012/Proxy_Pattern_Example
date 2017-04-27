package Proxy.Implementation.Structural;

// MainApp startup class for Structural
// Proxy Design Pattern.
public class MainApp {

	// Entry point into console application.
	public static void main(String[] args) {
		
		// Create proxy and request a service
		Proxy proxy = new Proxy();
		proxy.request();
	}
}
