package com.wipro.exceptionhandling;

import java.util.Scanner;

public class Test4 {
	
	public void checkProduct(int weight)
	{
		if(weight > 100)
		{
			System.out.println("product is valid");
		}
		else
		{
			try {
			throw new InvalidProductException("product weight must be greater than 100kgs");
			}
			catch(InvalidProductException ipe)
			{
				System.out.println(ipe.getMessage());
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Test4 obj = new Test4();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the product weight");
		int weight = scanner.nextInt();
		obj.checkProduct(weight);
	}

}
