package comparable;
import java.io.*;
public class Comparable
{
public static void main(String[] args) throws NumberFormatException, IOException	{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("How many Records do you want to store ? ");
	int num = Integer.parseInt(br.readLine());
	String a[]=new String[num];;
	String b[]=new String[num];
	int s=1;
	for(int i = 0;i<num;i++)
	{
	System.out.print("Enter the name of the state :");
	a[i]=br.readLine();
	System.out.print("Enter its Capital :");
	b[i]=br.readLine();
	s++;
	}
	System.out.println("-----------");
	System.out.println("Enter the name of the state whose capital is to be searched :");
	String name = br.readLine();
	for(int i = 0;i<a.length;i++)
	{
	if(name.equalsIgnoreCase(a[i]))
	System.out.println("Capital is :"+b[i]);
	}
	}
	}




