package com.wipro.abstraction;

public class i4i5Impl implements i4, i5 {


	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		i4.super.show();
		i5.super.show();
	}

	public static void main(String[] args) {
		
		i4i5Impl obj = new i4i5Impl();
		obj.show();
	}
}
