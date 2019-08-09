package com.capgemini.banking.services;

import com.capgemini.banking.bean.Account;

interface BankingService {
	
	void CreateAccount(Account account);

	void Depositmoney(double amount, Integer accno);

	void Checkbalance(double amount, Integer accno);

	void Fundstransfer(Integer accno1, Integer accno2);

	void Withdrawmoney(double amount, Integer accno);

}
