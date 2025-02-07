package com.wipro.java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class Test1 {
//boolean test(T t);
	public static void main(String[] args) {
		
		Predicate<Integer> p = x -> x%2==0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scanner.nextInt();
		
		
		if(p.test(number)) {
			System.out.println(number + " is even number");
			
		}
		else
		{
			System.out.println(number + " is odd number" );
		}
	}
}
