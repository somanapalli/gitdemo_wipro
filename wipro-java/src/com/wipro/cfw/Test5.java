package com.wipro.cfw;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test5 {

	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		s.add(100);
		/*
		 * s.add("rk"); s.add(5.6); s.add(false);
		 */
		s.add(6);
		s.add(67);
		s.add(-5);
		s.add(234);
		s.add(333);
		s.add(152);
		
		
		/*
		 * System.out.println(s.first()); System.out.println(s.last());
		 * System.out.println(s.headSet(234)); System.out.println(s.tailSet(152));
		 * System.out.println(s.subSet(67, 234));
		 */
		
		System.out.println(s);
	}
}
