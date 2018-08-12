package com.cg.pojo;

public class CurrentAccount extends BankAccount{
	
	private int overdraft;

	public CurrentAccount(Customer customer, int balance, int overdraft) {
		super(customer, balance);
		this.overdraft = overdraft;
	}
	
	public CurrentAccount() {
		super();
	}

	public int getOverdraft() {
		return overdraft;
	}
	
	@Override
	public String toString() {
		return customer.toString() + 
				"\nAccount type : CurrentAccount\nAccount Balance : Rs." + getBalance()+ 
				"\nOverdraft limit : Rs." + overdraft;
	}
	
	

}
