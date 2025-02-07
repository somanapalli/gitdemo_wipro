package com.wipro.java8;

import java.util.TreeSet;

public class Test7 {
	
	public static void main(String[] args) {
		
	
		// int compare(T o1, T o2);
		TreeSet<Student> ts = new TreeSet<>(
				(x,y) -> x.getStname().compareTo(y.getStname())
				);
		
		ts.add(new Student(34,"kumar"));
		ts.add(new Student(89,"rk"));
		ts.add(new Student(45,"ashish"));
		ts.add(new Student(21,"pratyush"));
		
		System.out.println(ts);
	}

}
