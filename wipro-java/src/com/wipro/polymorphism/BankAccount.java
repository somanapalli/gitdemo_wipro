package com.wipro.polymorphism;

public class BankAccount {
	
	//private fields
	
	private String accountNumber;
	private double balance;
	private String accountHolderName;
	
	public BankAccount(String accountNumber, double balance, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	
	//Deposit money
	
	public void deposit(double amount) {
		
		if(amount > 0) {
			balance += amount;
			System.out.println("successfully deposited: " + amount);
		}
		else {
			System.out.println("invalid deposit amount");
		}
	}
	
	//Withdraw money with a check 
	
	public void withdraw(double amount) {
		
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("successfully withdrawn :" + amount);
			
		}
		else {
			System.out.println("insufficient balance or invalid amount.");
		}
	}

}
