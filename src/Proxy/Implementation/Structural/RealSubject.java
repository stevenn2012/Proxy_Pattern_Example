package Proxy.Implementation.Structural;

// The 'RealSubject' class
public class RealSubject implements Subject{

	public void request() {
		System.out.println("Called RealSubject.Request()");
	}
}
