package com.wipro.polymorphism;

public class CopyConstructorDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student("rk",34);
		
		Student s2 = new Student(s1);
		
		s1.display();
		
		s2.display();
	}
}
