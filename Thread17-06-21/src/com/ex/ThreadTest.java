package com.ex;
public class ThreadTest implements Runnable{
	
	
	public void display()
	{
		for(int i=1;i<100;i++)
		{
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		display();
		
	}

}
