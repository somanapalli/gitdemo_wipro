package com.wipro.cfw;

import java.util.TreeSet;


public class Test6 {

	
	public static void main(String[] args) {
		
		TreeSet<Student> hs = new TreeSet<>(new StudentNameComparator());
		
		hs.add(new Student(100,"rk"));
		hs.add(new Student(101,"shaik"));
		hs.add(new Student(45,"ashish"));
		hs.add(new Student(234,"pratyush"));
		hs.add(new Student(56,"kumar"));
		
		System.out.println(hs);
	}
}
