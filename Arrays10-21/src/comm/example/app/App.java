package comm.example.app;

import java.util.Scanner;

import comm.example.Employee;
import comm.example.Engineer;
import comm.example.Manager;

public class App {
	
	private static Scanner scanner=new Scanner(System.in);
	private Employee[] employees;
	
	{
		System.out.println("enter the no.of employees:");
		int Employee=scanner.nextInt();
	}
	public static void main(String args[])
	{
		App app=new App();
		System.out.println("enter employee details:");
		int Employee=scanner.nextInt();
		System.out.println("enter Engineer details:");
		int Engineer=scanner.nextInt();
		System.out.println("enter employee details:");
		int Manager=scanner.nextInt();
		//enhanched for loop
		for(Employee employee : app.employees)
		{
			System.out.println(employee);
		}
		
		//standard for loop
		for(int i=0;i<app.employees.length;i++)
		{
			System.out.println(app.employees[i]);
		}
		
	}

}
