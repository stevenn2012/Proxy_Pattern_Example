package Proxy.Variations.Virtual;

//the 'Subject' abstract Class
public abstract class IDEOperation {

	private Compiler compiler;
	private Runtime runtime;
	
	public IDEOperation() {
		compiler = new Compiler();
		runtime = new Runtime();
	}
	
	public void compile(String javaFile){
		compiler.compile(javaFile);
	}
	
	public void run(String classFile){
		runtime.run(classFile);
	}
	
	public abstract void generateDocs(String javaFile);
	
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
