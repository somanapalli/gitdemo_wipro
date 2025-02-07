package com.wipro.polymorphism;

public class Test3 {

	@Override
	public String toString()
	{
		System.out.println(super.toString());
		return "rk";
	}
	public static void main(String[] args) {
		
		Test3 obj = new Test3();
		System.out.println(obj.toString());
	}
}
