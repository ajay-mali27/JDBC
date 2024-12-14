package com.tka.collection.set;

import java.util.HashSet;

public class Hashset1 {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("Rock");
		hs.add("Shraddha");
		hs.add("Mayuri");
		hs.add("John");
		hs.add("Prerana");
		
		
		for (String names : hs) {
			System.out.println(names);
		}
		
		

	}
}
