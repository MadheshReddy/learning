package model;

public interface AccountOperations {

	int getBalance();
	void withdraw(int withdrawalAmount);
	void deposit(int depositAmount);
	void transferFund(Account acc, int transferAmount);
	
}
