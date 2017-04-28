package Proxy.Variations.Virtual;

public class RealProcessor extends IDEOperation{

	JavaDoc jdoc;
	
	public RealProcessor() {
		jdoc = new JavaDoc();
	}
	
	public void generateDocs(String javaFile) {
		jdoc.generateDocs(javaFile);
	}

	class JavaDoc{
		public void generateDocs(String javaFile){
			System.out.println("Documento generado");
		}
	}
}
