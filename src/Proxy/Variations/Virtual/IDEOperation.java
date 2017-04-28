package Proxy.Variations.Virtual;

public abstract class IDEOperation {

	private Compiler cmp;
	private Runtime rtime;
	
	public void compile(String javaFile){
		cmp.compile(javaFile);
	}
	
	public void run(String classFile){
		rtime.run(classFile);
	}
	
	public abstract void generateDocs(String javaFile);
	
	public IDEOperation() {
		cmp = new Compiler();
		rtime = new Runtime();
	}
	
	class Compiler{
		public void compile(String javaFile){
			System.out.println("Archivo Compilado");
		}
	}
	
	class Runtime{
		public void run(String javaFile){
			System.out.println("Archivo Ejecutandose...");
		}
	}
}
