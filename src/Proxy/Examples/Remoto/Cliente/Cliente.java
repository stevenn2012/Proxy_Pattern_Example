package Proxy.Examples.Remoto.Cliente;

public class Cliente {

	private PersonaProxy persona;
	
	public static void main(String[] args) {
		new Cliente(); 
	}
	
	public Cliente(){
		persona = new PersonaProxy();
		persona.saludar();
		persona.decirEstado();
		persona.despedirse();
		persona.saludar();
		persona.decirEstado();
		persona.despedirse();
	}
}
