package com.wipro.abstraction;

public class i1i2Impl implements i1, i2 {

	@Override
	public void display() {
		System.out.println("display method");

	}

	@Override
	public void operation(int x, int y) {
		System.out.println(x*y);

	}

}
