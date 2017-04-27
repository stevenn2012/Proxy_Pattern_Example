package Proxy.Structural;

// The 'Proxy' class
public class Proxy implements Subject{

	private RealSubject realSubject;
	
	public void request() {
		// Use 'lazy initialization'
		if(realSubject == null) realSubject = new RealSubject();
		realSubject.request();
	}
}
