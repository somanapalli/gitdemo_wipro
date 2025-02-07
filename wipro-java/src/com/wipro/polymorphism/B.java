package com.wipro.polymorphism;

public class B extends A{

	
	public B()
	{
		
		//call super class parameterized constructor
		super(23);
		System.out.println("iam from default constructor - child class");
		
	}
}

/*this()-call current class default constructor
this(..) - call current class parameterized constructor
*/