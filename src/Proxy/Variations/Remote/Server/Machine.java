package Proxy.Variations.Remote.Server;

import Proxy.Variations.Remote.Subject.SubjectMachine;

//the 'RealSubject' Class
public class Machine extends SubjectMachine{

	private String status;
	
	public Machine() {
		this.status = "off";
	}

	public void turnOn() {
		this.status = "on";
	}
	
	public String viewStatus() {
		return "The machine status is "+status;
	}
	
	public void turnOff() {
		this.status = "off";
	}
}
