package com.cg.pojo;

public class SavingsAccount extends BankAccount{
	
	private boolean isSalaried;

	public SavingsAccount(Customer customer, int balance, boolean isSalaried) {
		super(customer, balance);
		this.isSalaried = isSalaried;
		
	}
	public SavingsAccount() {
		super();
	}

	public boolean isSalaried() {
		return isSalaried;
	}
	@Override
	public String toString() {
		return customer.toString() + 
				"\nAccount type : Savings account\n" 
				+ "Balance : Rs." + balance +
				"\nisSalaried : " + isSalaried;
	}
}
