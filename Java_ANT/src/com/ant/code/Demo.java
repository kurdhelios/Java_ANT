package com.ant.code;

public class Demo {

	public static void main(String[] args) {
		display();

	}

	private static void display() {
		int start = 0;
		int destination = 100;
		System.out.println("Executing Demo....");
		System.out.println("\n" + start + ":" + destination);
		for (start = 1; start < destination; start++) {
			System.out.println("\n" + start + ":" + destination);
		}
	}

}
