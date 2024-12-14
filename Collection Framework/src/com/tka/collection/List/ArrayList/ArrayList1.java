package com.tka.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class ArrayList1 {
	public static void main(String[] args) {

//		ArrayList-1
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(60);
		a.add(20);
		a.add(78);
		a.add(58);

//		System.out.println(a);

//		ArrayList -2

		ArrayList<String> list = new ArrayList<String>();

		list.add("Ajay");
		list.add("Vijay");
		list.add("Akay");
		list.add("Rahul");

//		System.out.println(list);

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

//3. We can also add the elements in this way

		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(69);
		List<Integer> List = new ArrayList<Integer>();
		List.add(55);
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(45);
		
//		System.out.println(AL);
		
//		Arraylist Methods --->
		
		ArrayList <String> al=new ArrayList<String>();
		al.add("Pencil");
		al.add("Cars");
		al.add("shop");
		
		al.add(1,"Mouse");
		System.out.println(al);  
	}
}
