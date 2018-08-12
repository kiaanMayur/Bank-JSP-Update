package com.cg.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;

import com.cg.pojo.BankAccount;
import com.cg.pojo.CurrentAccount;
import com.cg.pojo.SavingsAccount;

public class BankAccountDAOimpl implements BankAccountDAO {
	
	private List<BankAccount> accountList = new ArrayList<>();
	private Map<Integer, BankAccount> accountMap = new HashMap<>();
	private BankAccount bankAccount = new BankAccount();
	
	/* (non-Javadoc)
	 * @see com.cg.dao.BankAccountDAO#addAccount(com.cg.pojo.BankAccount)
	 */
	@Override
	public void addAccount(BankAccount account) {
		accountList.add(account);
		accountMap.put((int) account.getAccountNo(), account);
	}
	
	
	public  Collection<BankAccount> viewAllEmployees() {
		return  accountMap.values();
	}
	
	/* (non-Javadoc)
	 * @see com.cg.dao.BankAccountDAO#viewByAccNo(int)
	 */
	@Override
	public BankAccount viewByAccNo(int acc) {
		Set<Entry<Integer, BankAccount>> set = accountMap.entrySet();
		for(Entry e : set) {
			Predicate<Integer> checkById = Integer -> e.getKey().equals(acc);
			if(checkById != null) return (BankAccount) e.getValue();	
		}
		return null;
		
	}
	
	public int withdraw(int amount, int id) {
		Set<Entry<Integer, BankAccount>> set = accountMap.entrySet();
		for(Entry e : set) {
			Predicate<Integer> checkById = Integer -> e.getKey().equals(id);
			
			if(checkById != null) {
				return bankAccount.withdraw(amount);
			}
		}
		return 0;
	}
		
	public boolean deposit(int amount, int id) {
		Set<Entry<Integer, BankAccount>> set = accountMap.entrySet();
		for(Entry e : set) {
			Predicate<Integer> checkById = Integer -> e.getKey().equals(id);
			
			if(checkById != null) {
				return bankAccount.deposit(amount);
			}
		}
		return false;
	}

}
