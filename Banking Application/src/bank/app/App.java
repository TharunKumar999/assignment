package bank.app;

import bank.org.Banking;

public class App {
	public static void main(String[] args) throws Exception {
        System.out.println("Hello...!Welcome");
        Banking b = new Banking();
        b.initiate();
    }
}
