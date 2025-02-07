package com.wipro.java;

public class Employee {

	
	Employee()
	{
		//call current class parameterized constructor
		this(200,"rk");
		System.out.println("iam from default constructor");
	}
	//parameterized constructor
	Employee(int x, String y)
	{
		System.out.println("iam from parameterized constructor");
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		
				
	}
}
