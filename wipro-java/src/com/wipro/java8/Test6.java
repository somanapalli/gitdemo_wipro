package com.wipro.java8;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test6 {

	// int compare(T o1, T o2);
	public static void main(String[] args) {

		SortedSet<Integer> s = new TreeSet<>((x, y) -> y.compareTo(x));
		for (int i = 1; i <= 10; i++) {
			s.add(i);
		}
		System.out.println(s);
	}
}
