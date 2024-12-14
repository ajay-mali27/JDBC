package com.tka.interfaces;

public class Collection_Implement implements Collection, interface2 {

	public void m1() {
		System.out.println("Hello from m1");
	}

//	method from interface 2
	public void m2() {

	}

	public void student() {

	}

	public int teacher() {

		return 0;
	}

	public String boys() {

		return "name";
	}

	public static void main(String[] args) {
		Collection_Implement ss = new Collection_Implement();
		ss.m1();
	}

}
