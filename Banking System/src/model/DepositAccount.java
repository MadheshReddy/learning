package model;

public class DepositAccount extends Account {

	public final int withdrawalLimit = 30000,
			transerLimit = 100000, depositLimit = 2500000;

	public DepositAccount(String name, int accountNumber, int initialAmount) {
		
		super.withdrawalLimit = withdrawalLimit;
		super.depositLimit = depositLimit;
		super.transferLimit = transerLimit;
		this.name = name;
		this.accountNumber = accountNumber;
		this.amount = initialAmount;
	}

	@Override
	public String toString() {
		return "DepositAccount [name=" + name + ", accountNumber=" + accountNumber + ", amount=" + amount
				+", transfered=" + transfered + ", withdrawn=" + withdrawn+", deposited=" + deposited + "]";
	}
	
	
}
