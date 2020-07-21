package Proxy.ProxyDesignPattern;

import java.io.IOException;
public class F2 implements F1 {

	public void runCommand(String cmd) throws IOException {
                //some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "executed");
	}

	public void runCommand1(String cmd) {
		// TODO Auto-generated method stub
		
	}

}
