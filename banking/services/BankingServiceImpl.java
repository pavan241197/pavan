package com.capgemini.banking.services;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.banking.bean.Account;

public class BankingServiceImpl implements BankingService {
	
	Map<Integer, Account>acc=new HashMap<Integer, Account>();

	@Override
	public void CreateAccount(Account account) {
		acc.put(account.getAccountnumber(),account);
		System.out.println("account created successfully....");	
	}

	@Override
	public void Depositmoney(double amount, Integer accno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Checkbalance(double amount, Integer accno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Fundstransfer(Integer accno1, Integer accno2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Withdrawmoney(double amount, Integer accno) {
		// TODO Auto-generated method stub
		
	}


	

}
