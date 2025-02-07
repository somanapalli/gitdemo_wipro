package com.wipro.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	static int x;
	public static void main(String[] args) {
		try {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter the first number:");
		 int fno = scanner.nextInt();
		 System.out.println("enter the second number");
		 int sno = scanner.nextInt();
		 
		 double division = fno/sno;
		 
		 System.out.println("division is : " + division);
		}
		/*catch(RuntimeException re)
		{
			
			if(re instanceof ArithmeticException) {
				System.out.println("don't enter zero as denominator");
			}
			else if (re instanceof InputMismatchException)
			{
				System.out.println("please pass only numerics");
			}
		}*/
		
		
		catch(ArithmeticException ae)
		{
			System.out.println("i am here100");
			System.out.println("don't enter zero as denominator");
			
		}
		catch(InputMismatchException ipm)
		{
			System.out.println("please pass only numerics");
		}
		catch(RuntimeException re)
		{
			System.out.println(re);
		}
		
		finally
		{
			System.out.println("iam from finally block, executed always");
		}
		System.out.println("rest of the statements");
		System.out.println("rest of the statements");
		System.out.println("rest of the statements");
		System.out.println("rest of the statements");
		System.out.println("rest of the statements");
		System.out.println("rest of the statements");
		
	}

}
