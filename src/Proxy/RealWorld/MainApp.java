package Proxy.RealWorld;

// MainApp startup class for Real-World 
// Proxy Design Pattern.
public class MainApp {
	
    // Entry point into console application.
	public static void main(String[] args) {
		
		// Create math proxy
	    MathProxy proxy = new MathProxy();
	 
	    // Do the math
	    System.out.println("4 + 2 = " + proxy.Add(4, 2));
	    System.out.println("4 - 2 = " + proxy.Sub(4, 2));
	    System.out.println("4 * 2 = " + proxy.Mul(4, 2));
	    System.out.println("4 / 2 = " + proxy.Div(4, 2));
	}
}
