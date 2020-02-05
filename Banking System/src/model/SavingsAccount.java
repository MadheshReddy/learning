package model;

public class SavingsAccount extends Account  {
	
	public final int withdrawalLimit = 20000,
			transerLimit = 40000, depositLimit = 10000;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String name, int accountNumber, int initialAmount) {

		super.withdrawalLimit = withdrawalLimit;
		super.depositLimit = depositLimit;
		super.transferLimit = transerLimit;
		this.name = name;
		this.accountNumber = accountNumber;
		this.amount = initialAmount;
	}

	@Override
	public String toString() {
		return "SavingsAccount [name=" + name + ", accountNumber=" + accountNumber + ", amount=" + amount
				+ ", transfered=" + transfered + ", withdrawn=" + withdrawn + ", deposited=" + deposited + "]";
	}
	
	
}
