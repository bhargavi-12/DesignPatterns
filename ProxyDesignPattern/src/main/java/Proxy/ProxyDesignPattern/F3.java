package Proxy.ProxyDesignPattern;

public class F3 implements F1 {

	private boolean isAdmin;
	private F2 executor;
	
	public F3(String user, String pwd){
		if("Pankaj".equals(user) && "J@urnalD$v".equals(pwd)) isAdmin=true;
		executor = new F2();
	}
	
	public void runCommand(String cmd) throws Exception {
		if(isAdmin){
			executor.runCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(cmd);
			}
		}
	}

}