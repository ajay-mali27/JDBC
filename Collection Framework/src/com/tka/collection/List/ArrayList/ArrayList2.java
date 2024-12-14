package com.tka.collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {

		ArrayList<Integer> AL = new ArrayList<>();
//Collections Methods-
//		1. add
		AL.add(45);
		AL.add(55);
		AL.add(21);
		AL.add(35);

//		System.out.println(AL);

//2.		AL.remove(1);
//		System.out.println(AL);

//3.		System.out.println(AL.size());
//4.		System.out.println(AL.isEmpty());
//5.		System.out.println(AL.contains(45));
		
//6. System.out.println(AL.get(0));	 -> it is use to find the element with index.	
		

//		2. addAll();

		ArrayList<String> electronics = new ArrayList<String>();
		electronics.add("Mobile");
		electronics.add("TV");

		ArrayList<String> Vehicle = new ArrayList<String>();
		Vehicle.add("Bike");
		Vehicle.add("Car");

		ArrayList<String> allProducts = new ArrayList<String>();

		allProducts.addAll(electronics);
		allProducts.addAll(Vehicle);

//		System.out.println(allProducts);
	}
}
