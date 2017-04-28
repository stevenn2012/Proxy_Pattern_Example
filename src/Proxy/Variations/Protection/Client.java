package Proxy.Variations.Protection;

//The 'Client' Class
public class Client {

	public static void main(String[] args) {
		new Client().folderAccess();
	}
	
	private void folderAccess(){
		System.out.println(this.getClass()+" : Client passing user with designation 'CEO' to folderproxy");
		User steven = new User("Steven", "123abc", "CEO");
		FolderProxy folderProxy = new FolderProxy(steven);
		folderProxy.performReadOrWriteOperations();
		
		System.out.println("\n********************************************************************************");
		System.out.println(this.getClass()+" : Client passing User with designation 'Developer' to folderproxy");
		User juliana = new User("Juliana", "abdc135", "Developer");
		FolderProxy folderProxyWrong = new FolderProxy(juliana);
		folderProxyWrong.performReadOrWriteOperations();
	}
}
