package com.wipro.polymorphism;

public class Student {

	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//copy constructor
	
	public Student(Student s)
	{
		this.name=s.name;
		this.age=s.age;
		
	}
	
	public void display() {
		System.out.println("Name:" + name + ", Age:" + age);
	}
	
	
	
}
