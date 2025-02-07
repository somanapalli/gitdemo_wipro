package com.wipro.java;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first no");
		int fno = scanner.nextInt();
		
		System.out.println("enter the second no");
		int sno = scanner.nextInt();
		
		int sum = fno+sno;
		System.out.println("sum is: " +sum);
	}

}
