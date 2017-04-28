package Proxy.Implementation.RealWorld;

//the 'Client' Class
public class MainApp {
	
	public static void main(String[] args) {
	    MathProxy proxy = new MathProxy();
	 
	    System.out.println("4 + 2 = " + proxy.Add(4, 2));
	    System.out.println("4 - 2 = " + proxy.Sub(4, 2));
	    System.out.println("4 * 2 = " + proxy.Mul(4, 2));
	    System.out.println("4 / 2 = " + proxy.Div(4, 2));
	}
}
