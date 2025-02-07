package com.wipro.java8;

import java.util.Scanner;
import java.util.function.Function;

public class Test3 {

	//R apply(T t);
	public static void main(String[] args) {
		
		Function<String, Integer> function = 
				
				x -> x.length();
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the string");
		String name = scanner.nextLine();
		
		System.out.println("the length of given string is: " + function.apply(name));
		
	}
}
