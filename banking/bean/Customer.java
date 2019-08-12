package com.capgemini.banking.bean;

public class Customer {
	public String name;
	public String mobileno;
	public String address, pincode;
	public String EmailId;

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
		
	}
	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobileno=" + mobileno + ", address=" + address + ", pincode=" + pincode
				+ "]";
	}

	
		
		
	

}
