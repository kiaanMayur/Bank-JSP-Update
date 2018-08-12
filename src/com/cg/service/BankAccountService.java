package com.cg.service;

import java.util.Collection;
import java.util.List;

import com.cg.dao.BankAccountDAOimpl;
import com.cg.pojo.BankAccount;

public class BankAccountService {
	
	private BankAccountDAOimpl dao = new BankAccountDAOimpl();
	
	public void AddAccount(BankAccount account) {
		dao.addAccount(account);
	}
	
	public Collection<BankAccount> viewAllEmployees() {
		return dao.viewAllEmployees();
	}
	
	public BankAccount viewByAccNo(int acc) {
		return dao.viewByAccNo(acc);
	}

}
