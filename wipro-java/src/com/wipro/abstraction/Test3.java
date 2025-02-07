package com.wipro.abstraction;
//execution logic class
public class Test3 {

	public static void main(String[] args) {
		/*
		i1 obj =new i1Impl1();
		obj.operation(2, 3);
		
		i1 obj1 = new i1Impl2();
		obj1.operation(4, 3);*/
		
		i2 obj = new i1i2Impl();
		obj.operation(3, 2);
		obj.display();
		
	}
}
