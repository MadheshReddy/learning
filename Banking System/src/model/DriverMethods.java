package model;

import java.util.Scanner;

import driver.Driver;

public class DriverMethods {
	
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Used to create a Bank Account of required type
	 * @param  no parameters needed
	 * @return does not return anything
	 */
	public static void createAccount()
	{
		
		System.out.println("What kind of account you want?\n"
				+ " 1.Salary\n 2.Savings\n 3.Deposit");
		
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name:: "); String name = sc.nextLine();
		System.out.println("Enter your desired account number:: "); int accountNumber = sc.nextInt(); 
		if(!isAccountNumberTaken(accountNumber))
		{
			System.out.println("Enter initial amount:: "); int initialAmount = sc.nextInt();
			
			Account acc = null;;
			switch(choice)
			{
				case 1: acc = new SalaryAccount(name, accountNumber, initialAmount); 
								Driver.customers.add(acc); break; 
								
				case 2: acc = new SavingsAccount(name, accountNumber, initialAmount);
								Driver.customers.add(acc); break;
								
				case 3: acc = new DepositAccount(name, accountNumber, initialAmount);
								Driver.customers.add(acc); break;
				
				default: System.out.println("--#Invalid Choice#-- \nBye Bye");
			}
			
			if(choice == 1 || choice == 2 || choice == 3)
				System.out.println("Account created. Now what?");
		}
		else
			System.out.println("Account number already taken");
	}
	
	public static void withdraw()
	{
		int accNumber = getAccountNumber();
		Account acc = selectCustomer(accNumber);
		
		if(acc != null)
		{
			System.out.println("Enter the amount to be withdrawn");
			int amount = sc.nextInt();
			acc.withdraw(amount);
		}
		else
			System.out.println("Account not found");
	}
	
	public static void deposit()
	{
		int accNumber = getAccountNumber();
		Account acc = selectCustomer(accNumber);
		if(acc != null) {
			System.out.println("Enter the amount to deposit");
			int amount = sc.nextInt();
			acc.deposit(amount);
		}
		else
			System.out.println("Account not found");
	}
	
	public static void transfer()
	{
		System.out.println("Enter your account number");
		int accNumber = sc.nextInt();
		Account acc = selectCustomer(accNumber);
		
		if(acc != null) {
			
			System.out.println("Enter recipient's account number");
			accNumber = sc.nextInt();
			Account recAcc = selectCustomer(accNumber);
			
			if(recAcc != null) {
				System.out.println("Enter the amount to transfer");
				int amount = sc.nextInt();
				acc.transferFund(recAcc, amount);
			}
			else
				System.out.println("Recipient account not found"); 
		}
		else
			System.out.println("Account not found");
	}
	
	public static void checkBalance()
	{
		int accNumber = getAccountNumber();
		Account acc = selectCustomer(accNumber);
		
		if(acc != null)
		{
			System.out.println("Balance:: "+ acc.getBalance());
		}
		else
			System.out.println("Account not found");
	}
	
	

	//supporting methods
	
	//returns the account object matching the given account number
	public static Account selectCustomer(int accNumber)
	{
		for(Account a : Driver.customers)
		{
			if(a.accountNumber == accNumber)
				return a;
		}
		return null;
	}
	
	//returns account number read from Standard input
	public static int getAccountNumber()
	{
		System.out.println("Enter your account number");
		int accNumber = sc.nextInt();
		return accNumber;
	}
	
	//to check whether the account number is already taken or not
	public static boolean isAccountNumberTaken(int accNumber)
	{
		for(Account a : Driver.customers)
		{
			if(a.accountNumber == accNumber)
				return true;
		}
		return false;
	}
	
	public static void accountDetails()
	{
		int accNumber = getAccountNumber();
		Account acc = selectCustomer(accNumber);
		
		if(acc != null)
		{
			System.out.println(acc);
		}
		else
			System.out.println("Account not found");
	}
}
