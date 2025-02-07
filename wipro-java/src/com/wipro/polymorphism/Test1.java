package com.wipro.polymorphism;

public class Test1 {
	
	public void sum(int x, int y) {
		System.out.println("integer sum is: " + (x+y));
	}
	
	public void sum(float x, float y)
	{
		System.out.println("float sum is:" + (x+y));
	}
	
	public static void main(String[] args) {
		
		Test1 obj;//object declaration
		obj= new Test1();//object referencing
		
		obj.sum(2, 3);
		obj.sum(5.6f,3.4f);
	}

}
