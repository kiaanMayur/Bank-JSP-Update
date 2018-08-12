package com.cg.dao;

import java.util.Collection;
import java.util.List;

import com.cg.pojo.BankAccount;

public interface BankAccountDAO {

	void addAccount(BankAccount account);

	Collection<BankAccount> viewAllEmployees();

	BankAccount viewByAccNo(int acc);

}