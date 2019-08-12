package com.capgemini.banking.bean;

public class Account {
	
	private String accounttype;
	static int accountnumber = 100;
	private Customer customer;
	private double initialbalance = 0;

	public Account() {
		super();
		
		setAccountnumber(accountnumber);
		setAccounttype(accounttype);
		setCustomer(customer);
		setInitialbalance(initialbalance);

	}

	

	public String getAccounttype() {
		return accounttype;
	}

	

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}



	public static int getAccountnumber() {
		return accountnumber++;
	}

	public static void setAccountnumber(int accountnumber) {
		Account.accountnumber = accountnumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getInitialbalance() {
		return initialbalance;
	}

	public void setInitialbalance(double initialbalance) {
		this.initialbalance = initialbalance;
	}



	@Override
	public String toString() {
		return "Account [accounttype=" + accounttype + ", customer=" + customer + ", initialbalance=" + initialbalance
				+ "]";
	}



	






	

}
