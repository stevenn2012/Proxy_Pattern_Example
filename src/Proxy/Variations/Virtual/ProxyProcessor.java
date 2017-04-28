package Proxy.Variations.Virtual;

public class ProxyProcessor extends IDEOperation{

	private RealProcessor realProcessor;
	
	public void generateDocs(String javaFile){
		if(realProcessor == null){
			realProcessor = new RealProcessor();
		}
		realProcessor.generateDocs(javaFile);
	}
}
