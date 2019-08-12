package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.banking.bean.Account;
import com.capgemini.banking.bean.Customer;
import com.capgemini.banking.services.BankingServiceImpl;

public class Main {
	static Scanner sc = new Scanner(System.in);

	private static Account createCustomer() {
		Account account = new Account();
		Customer customer = new Customer();
		sc.nextLine();
		customer = new Customer();
		customer.setName(input("Enter name"));
		customer.setMobileno(input("Enter mobileno"));
		customer.setEmailId(input("Enter EmailId"));
		customer.setAddress(input("Enter address"));
		customer.setPincode(input("Enter pincode"));
		account.setAccounttype(input("Enter the Account Type"));
		account.setCustomer(customer);
		return account;
	}

	private static String input(String string) {
		String message = string;
		System.out.println(message);
		return sc.nextLine();
	}


	public static void main(String[] args) {
			BankingServiceImpl a = new BankingServiceImpl();
			int choice=1;
			do{
				
				System.out.println("Welcome to paypa's bank");
				System.out.println("1. CreateAccount");
                System.out.println("2. Depositmoney");
                System.out.println("3. Checkbalance");
                System.out.println("4. Fundstransfer");
                System.out.println("5. Withdrawmoney");
                System.out.println("6. Display Account Details");
                System.out.println("0. to quit: \n");
                System.out.print("Enter Your Choice : ");
                choice = sc.nextInt();
                switch (choice) {
                
                
                case 1 :
                	 a.CreateAccount(createCustomer());
                 	System.out.println("Account created successfully....");
                	break;
                    
                case 2 :
                	  System.out.println("Enter the Amount to be deposited and Account Number ");
                      a.Depositmoney(sc.nextInt(), sc.nextInt());
                      sc.nextLine();
                      break;
                case 3:
                    System.out.println("Enter the Account Number to showbalance");
                    a.Checkbalance(sc.nextInt());
                    break;
                    
                case 4:
              	  System.out.println("Enter the sender and reciever account numbers");
                    a.Fundstransfer(sc.nextInt(), sc.nextInt());
                    break;
                      
                case 5 :
                	  System.out.println("Enter the amount to be Withdraw and Account Number ");
                      a.Withdrawmoney(sc.nextInt(), sc.nextInt());
                      sc.nextLine();
                      break;
             
                case 6 :
                	System.out.println("**********Thank you**********");
                    break;
			}
				
			}while(choice!=0);
	}
	}

