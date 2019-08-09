package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.banking.bean.Account;
import com.capgemini.banking.bean.Customer;
import com.capgemini.banking.services.BankingServiceImpl;

public class Main {
	static Scanner sc= new Scanner(System.in);
	private static String input(String string) {
		String message= string;
		System.out.println("message");
		return sc.nextLine();
	}
			private static Account createCustomer() {
				Account account= new Account();
				Customer customer= new Customer();
				customer= new Customer();
				customer.setAddress(input("adress"));
				customer.setMobileno(input("mobileno"));
				customer.setName(input("name"));
				customer.setPincode(input("pincode"));
				account.setCustomer(customer);
				return account;
	}
			public static void main(String[] args) {
			BankingServiceImpl impl= new BankingServiceImpl();
			int choice;
			do{
				
				System.out.println("Welcome to paypa's bank");
				System.out.println("1. Create Account");
                System.out.println("2. Deposit money");
                System.out.println("3. Check balance");
                System.out.println("4. Funds transfer");
                System.out.println("5. Withdraw money");
                System.out.println("6. Display Account Details");
                System.out.println("0. to quit: \n");
                System.out.print("Enter Your Choice : ");
                choice = sc.nextInt();
                switch (choice) {
                
                
                case 1 :
                	System.out.println("Enter your name...");
                	String name= sc.next();
                	System.out.println("enter mobileno.....");
                	long mobileno=sc.nextLong();
                	System.out.println("Enter address....");
                	String address= sc.next();
                	System.out.println("enter pincode.....");
                	long pincode=sc.nextLong();
                	System.out.println("Enter the initial openeing balance.....");
                	long initialOpeningBalance=sc.nextInt();
                  	System.out.println("Enter the updated balance.....");
                 	long currentbalance= sc.nextInt();
                 	BankingServiceImpl a = new BankingServiceImpl();
                	
                	
                	
                
                }
			}while(choice!=6);
				
			}
		
}
