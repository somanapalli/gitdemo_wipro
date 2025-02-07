package com.wipro.polymorphism;

public class Test4 {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("123456789",10000.0, "rk");
		
		System.out.println("account holder: " + account.getAccountHolderName());
		System.out.println("account balance:" + account.getBalance());
		
		//depositing money
		account.deposit(2000);
		//trying to withdraw money
		account.withdraw(5000);
		
		//final balance
		
		System.out.println("final balance: " + account.getBalance());
	
	}

}
