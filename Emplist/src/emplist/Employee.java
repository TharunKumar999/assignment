package emplist;
import java.util.Scanner;

public class Employee
{
	    int id;
	    String name;
	    String department;
	    int dateOfJoining;
	    int age;
	    float salary;


	}

	class Main {
	    public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter How many employee:");
	        int k = sc.nextInt();

	        Employee emp[] = new Employee[k];

	        for (int i = 0; i < k; i++) {
	            emp[i] = new Employee();

	            System.out.println("Enter " + (i + 1) + " Employee data :");

	            System.out.println("Enter employee id :");
	            emp[i].id = sc.nextInt();
	            System.out.println("Enter employee name :");
	            emp[i].name = sc.next();
	            System.out.println("Enter employee salary :");
	            emp[i].salary = sc.nextFloat();
	            System.out.println("Enter employee Department :");
	            emp[i].department = sc.next();
	            System.out.println("Enter employee age :");
	            emp[i].age = sc.nextInt();
	            System.out.println("Enter employee Date of Joining :");
	            emp[i].dateOfJoining = sc.nextInt();

	        }
	        try {
	        	  // block of code that can throw exceptions
	        	} catch (Exception ex) {
	        	  // Exception handler
	        	}
	        System.out.println("\n\n============ All employee details are :============\n");

	        for (int i = 0; i < k; i++) {
	            System.out.println("Employee id  name and salary and age and Date of joining and department :" + emp[0].id + " " + emp[i].name + " " + emp[i].salary+" "+emp[i].age+emp[i].dateOfJoining+" "+emp[i].department);

	        }
	    }

	}

