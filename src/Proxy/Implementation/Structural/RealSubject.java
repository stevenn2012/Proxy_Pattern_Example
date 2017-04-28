package Proxy.Implementation.Structural;

// The 'Real Subject' class
public class RealSubject implements Subject{

	public void request() {
		System.out.println("Called RealSubject.Request()");
	}
}
