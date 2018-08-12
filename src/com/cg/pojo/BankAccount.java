package com.cg.pojo;

public class BankAccount {
	
	private static long accountNo;
	protected Customer customer;
	private static int accountId;
	protected int balance;
	
	public int getBalance() {
		return balance;
	}
	
	static {
		accountId = 10000;
	}

	public BankAccount() {
		
	}
	{
		this.accountNo = ++accountId;
	}

	public BankAccount(Customer customer, int balance) {
		this.customer = customer;
		this.balance = balance;
	}
	
	public long getAccountNo() {
		return accountNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int withdraw(int amount) {
		if(amount > balance) {
			return 0;
		}
		else {
			balance -= amount;
			return this.balance;
		}
		
	}

	public boolean deposit(int amount) {
		balance += amount;
		return true;
	}

}
