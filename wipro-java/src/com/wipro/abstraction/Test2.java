package com.wipro.abstraction;
//execution logic class
public class Test2 {

	public static void main(String[] args) {
		//downcasting or runtime polymorphism
		Test1 obj = new SumOperation();
		obj.operation(3, 4);
		
		Test1 obj1 = new SubOperation();
		obj1.operation(4, 3);
	}
}
