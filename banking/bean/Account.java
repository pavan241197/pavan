package com.capgemini.banking.bean;

public class Account {
	private int current;
	private int savings;
	private int accounttype = savings / current;
	private int accountnumber;
	private Customer customer;
	private int initialbalance = 0;

	public Account(int current, int savings, int accounttype, int accountnumber, Customer customer, int initialbalance) {
		super();
		this.current = current;
		this.savings = savings;
		this.accounttype = accounttype;
		this.accountnumber = accountnumber;
		this.customer = customer;
		this.initialbalance = initialbalance;
	}

	public Account() {
		super();
	}
	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getSavings() {
		return savings;
	}

	public void setSavings(int savings) {
		this.savings = savings;
	}

	public int getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(int accounttype) {
		this.accounttype = accounttype;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getInitialbalance() {
		return initialbalance;
	}

	public void setInitialbalance(int initialbalance) {
		this.initialbalance = initialbalance;
	}
	@Override
	public String toString() {
		return "Account [current=" + current + ", savings=" + savings + ", accounttype=" + accounttype
				+ ", accountnumber=" + accountnumber + ", customer=" + customer + ", initialbalance=" + initialbalance
				+ "]";
	}


}
