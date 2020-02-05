package model;


public class Account implements AccountOperations {
	
	public String name;
	public int accountNumber;
	public int amount;
	
	//Limit values of an account
	public int transferLimit, withdrawalLimit, depositLimit;
	
	//amount that is <?> so far
	public int transfered, withdrawn, deposited;
	
	@Override
	public int getBalance() {
		return amount;
	}
	
	@Override
	public void withdraw(int withdrawalAmount) {
		//withdrawing specified amount
		if(amount >= withdrawalAmount && withdrawn+withdrawalAmount <= withdrawalLimit)
		{
			amount -= withdrawalAmount;
			withdrawn += withdrawalAmount;
			System.out.println("Withdrawn :: " + withdrawalAmount);
		}
		else
		{
			System.out.println("You don't have sufficient balance or "
					+ "your withdrawal limit is reached");
		}
	}
	
	@Override
	public void deposit(int depositAmount) {
		//depositing specified amount
		if(deposited+depositAmount <= depositLimit)
		{
			amount += depositAmount;
			deposited += depositAmount;
			System.out.println("Deposited :: "+ depositAmount);
		}
		else
		{
			System.out.println("Your limit is reached");
		}
		
	}
	
	@Override
	public void transferFund(Account acc, int transferAmount) {
		//transferring specified amount to another account
		if(transferAmount+transfered <= transferLimit && transferAmount <= amount) 
		{
			acc.amount += transferAmount;
			amount -= transferAmount;
			transfered += transferAmount;
			System.out.println("Transfered :: "+ transferAmount +" to " + acc.name);
		}
		else
			System.out.println("You don't have enough balance or"
					+ " your transfer limit is reached");
	}
	
	
	
}
