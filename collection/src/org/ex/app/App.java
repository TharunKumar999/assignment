package org.ex.app;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.Scanner;

import org.ex.Beer;

public class App {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//implementing generic using collections
		//Specifying the type of the collection
		Set<Beer> set=new HashSet<Beer>();
		System.out.println("enter the uid");
		String uid=sc.nextLine();
		System.out.println("eneter the beername");
		String beername=sc.nextLine();
		System.out.println("enter the price");
		double price=sc.nextDouble();
		//set.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		//set.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		//set.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		//set.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		//set.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		System.out.println("uid:"+uid);
		List<Beer> list=new ArrayList<Beer>();
		list.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		list.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		list.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		list.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		list.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		System.out.println(list);
		Set<Integer> set1=new HashSet<Integer>();
		set1.add( (int) (price=sc.nextInt()));
		set1.add(10);
		set1.add(10);
		set1.add(10);
		set1.add(10);
		set1.add(50);
		System.out.println(set1);
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(10);
		list1.add(9);
		list1.add(20);
		list1.add(8);
		list1.add(50);
		System.out.println(list1);
		

	}


}
