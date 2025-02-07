package com.wipro.cfw;

import java.util.Comparator;

public class StudentIDComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getStid().compareTo(o1.getStid());
		
	}

}
