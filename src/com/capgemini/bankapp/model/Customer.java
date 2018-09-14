package com.capgemini.bankapp.model;

import java.util.Date;

public class Customer {
	private int custId;
	private String custName;
	private String custPassword;
	private String custEmail;
	private String custAddress;
	private String custDob;
	private BankAccount custAccount;
	public Customer(int custId, String custName, String custPassword, String custEmail, String custAddress,
			String custDob, BankAccount custAccount) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPassword = custPassword;
		this.custEmail = custEmail;
		this.custAddress = custAddress;
		this.custDob = custDob;
		this.custAccount = custAccount;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustDob() {
		return custDob;
	}
	public void setCustDob(String custDob) {
		this.custDob = custDob;
	}
	public BankAccount getCustAccount() {
		return custAccount;
	}
	public void setCustAccount(BankAccount custAccount) {
		this.custAccount = custAccount;
	}
	

}
