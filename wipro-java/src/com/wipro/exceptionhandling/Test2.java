package com.wipro.exceptionhandling;

public class Test2 {
	
	//called function
	public void division() throws ArithmeticException
	{
		int x = 100/0;
		System.out.println("division is: " + x);
	}

}
