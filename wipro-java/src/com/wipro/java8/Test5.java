package com.wipro.java8;

import java.util.Scanner;
import java.util.function.Supplier;

public class Test5 {

	//T get();
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a string:");
		String inputString = scanner.nextLine();
		
		//supplier to return the length of the string
		
		Supplier<Integer> supplier = () -> inputString.length();
		
		//get the length from the supplier
		
		System.out.println("Length of the string: " + supplier.get());
		
	}
}

