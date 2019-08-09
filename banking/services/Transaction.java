package com.capgemini.banking.services;

public class Transaction {

	static Integer transIdCounter = 1546245;
	private Integer transId;
	private String type;
	private String description;
	private double amount;

	public Transaction() {
		super();

	}

	public Transaction(Integer transId, String type, String description, double amount) {
		super();
		this.transId = transId;
		this.type = type;
		this.description = description;
		this.amount = amount;
	}

	public Integer getTransId() {
		return transId;
	}

	public void setTransId(Integer transId) {
		this.transId = transId++;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}