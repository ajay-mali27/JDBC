package com.tka.collection.set;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("ajay");
		ts.add("ajay"); //duplicate ele. not allowed.
		ts.add("rahul");
		ts.add("bhaskar");
		ts.add("gaurav");
	
		System.out.println(ts);
		
	}
}
