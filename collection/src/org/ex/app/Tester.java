package org.ex.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import org.ex.Beer;

public class Tester {


		private Map<Integer, Beer> map=null;
		
		{
			map=new HashMap<Integer,Beer>();
		}
		
		private static Scanner scanner=new Scanner(System.in);
		private void checkPrice(double price)
		{
			if(price<=100)
			{
				throw new InvalidPriceException("Invalid Price");
			}
		}
		public static void main(String args[])
		
		{
			int key=1;
			int choice=0;
			Tester tester=new Tester();
			
			do
			{
				try {
					System.out.println("1. Add A New Beer.");
					System.out.println("2. Display All Available Beer.");
					System.out.println("3. Fidn A Beer.");
					System.out.println("4. Delete a Beer.");
					System.out.println("0. Quit");
					System.out.print("Enter Your choice: ");
					choice=scanner.nextInt();
					switch (choice) {
					case 1:
						System.out.print("Beer Name: ");
						char ch=scanner.next().charAt(0);
						if(ch<=5)
						{
							System.out.println("not Acceptable");
							break;
						}
						
						
						String name=scanner.next();
						System.out.print("Beer Price: ");
						double price=scanner.nextDouble();
						/*
						 * if(price<=100) { throw new InvalidPriceException("Invalid Price"); }
						 */
						try {
							
						} catch (InvalidPriceException e) {
							
							System.err.println(e.getMessage());
						}
						tester.checkPrice(price);
						
						tester.map.put(key++, new Beer(UUID.randomUUID().toString(), name, price));
						System.out.println("Beer Added Sucessfully...");
						break;
					case 2:
						Collection<Beer> collection=tester.map.values();
						Iterator<Beer> i=collection.iterator();
						while(i.hasNext())
						{
							Beer b=i.next();
							System.out.println(b);
						}

						break;
					case 3:
						System.out.print("Enter beer id: ");
						int id=scanner.nextInt();
						Beer beer=tester.map.get(id);
						if(beer==null)
						{
							System.out.println("no beer found with the id: "+id);
						}
						else
						{
							System.out.println("Beer Found\n"+beer);
						}
						break;
					case 4:
						System.out.print("Enter beer id: ");
						id=scanner.nextInt();
						beer=tester.map.get(id);
						if(beer==null)
						{
							System.out.println("no beer found with the id: "+id);
						}
						else
						{
							tester.map.remove(id);
							System.out.println("Removed Sucessfully");
						}
						break;
						
					case 0:
						System.out.println(tester.map);
						System.out.println("Exit from System. Bye..");
						
						System.exit(0);
						break;
						
					default:
						System.out.println("Invalid Choice Try Again.");
						break;
					}
					
				} catch (InputMismatchException e) {
					System.err.println("input mispatched.");
					
				}
				
			}while(choice!=0);
		}	
			
			
		}