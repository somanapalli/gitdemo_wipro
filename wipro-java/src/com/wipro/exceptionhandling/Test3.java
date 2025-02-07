package com.wipro.exceptionhandling;

public class Test3 {

	//calling function 
	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		try {
		obj.division();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("something wrong in division method");
		}
		
		
	}
}
