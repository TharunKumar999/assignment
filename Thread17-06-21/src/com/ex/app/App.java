package com.ex.app;
import com.ex.ThreadTest;

public class App {

	public static void main(String[] args) {
		ThreadTest test=new ThreadTest();

		Thread t=new Thread(test);
		System.out.println(t.getName());
		t.start();
		Thread t1=new Thread(test);
		System.out.println(t1.getName());
		t1.start();
		Thread t2=new Thread(test);
		System.out.println(t2.getName());
		t2.start();
		Thread  t3=new Thread(test);
		System.out.println(t3.getName());
		t3.start();
	}

}
