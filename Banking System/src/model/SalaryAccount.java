package model;

public class SalaryAccount extends Account  {
	
	public final int withdrawalLimit = 100000,
			transerLimit = 500000, depositLimit = 50000;

	public SalaryAccount(String name, int accountNumber, int initialAmount) {
		super.withdrawalLimit = withdrawalLimit;
		super.depositLimit = depositLimit;
		super.transferLimit = transerLimit;
		this.name = name;
		this.accountNumber = accountNumber;
		this.amount = initialAmount;
	}
	
	@Override
	public String toString() {
		return "SalaryAccount [name=" + name + ", accountNumber=" + accountNumber + ", amount=" + amount
				+ ", transfered=" + transfered + ", withdrawn=" + withdrawn + ", deposited=" + deposited + "]";
	}
	
	

}
