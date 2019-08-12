package com.capgemini.banking.services;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.banking.bean.Account;
import com.capgemini.banking.bean.Customer;

public class BankingServiceImpl implements BankingService {
	Customer customer = new Customer();
	Account account = new Account();
	File file = new File("C:\\CAPGEMINI\\bank.txt");
	Scanner sc = new Scanner(System.in);

	Map<Integer, Account> acc = new HashMap<Integer, Account>();

	@Override
	public void CreateAccount(Account account) {
		acc.put(account.getAccountnumber(), account);
		System.out.println(acc);
	}

	@Override
	public void Depositmoney(double amount, Integer accno) {
		double curbal = 0;
		if (acc.containsKey(accno)) {
			curbal += acc.get(accno).getInitialbalance() + amount;
			acc.get(accno).setInitialbalance(curbal);
			System.out.println("deposit done sucessfully...");
		} else {
			System.out.println("account not found...");
		}

	}

	@Override
	public void Checkbalance(Integer accno) {
		if (acc.containsKey(accno)) {
			System.out.println("balance in account=" + acc.get(accno).getInitialbalance());
		} else {
			System.out.println("account not found");
		}
	}

	@Override
	public void Withdrawmoney(double amount, Integer accno) {
		double curbal = 0;
		if (acc.containsKey(accno)) {
			curbal += acc.get(accno).getInitialbalance() - amount;
			acc.get(accno).setInitialbalance(curbal);
			System.out.println("withdrawl done sucessfully...");
		} else {
			System.out.println("Insufficient funds...");
		}

	}

	@Override
	public void Fundstransfer(Integer accno1, Integer accno2) {
		double receiver;
		double sender;
		double amount;
		if (accno1.equals(accno2)) {
			System.out.println("accs are same");
		} else {
			receiver = acc.get(accno2).getInitialbalance();
			sender = acc.get(accno1).getInitialbalance();
			System.out.println("Enter amount to be transferred");
			amount = sc.nextDouble();
			if (amount > sender) {
				System.out.println("amount greater than existing balance");
			} else {
				receiver = acc.get(accno2).getInitialbalance() + amount;
				sender = acc.get(accno1).getInitialbalance() - amount;
				acc.get(accno1).setInitialbalance(sender);
				acc.get(accno2).setInitialbalance(receiver);
				System.out.println("fundtransfered....");
			}

		}

	}

}
