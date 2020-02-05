package driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Account;
import model.DriverMethods;

public class Driver {
	
	static Scanner sc = new Scanner(System.in);
	public static List<Account> customers = new ArrayList<>();
	
	public static void main(String[] args) {
		
		System.out.println("---**Hi, Welcome to DubaiSate Bank**---\n"
				+ "\n How can I help you?\n"
				+ "\n 1.Create New Account\n 2.Withdraw\n 3.Deposit\n"
				+ " 4.Transfer\n 5.Check Balance\n 6.Account Details"
				+ "\n\n***--Wrong Option terminates the entire session--*** \n");
		
		int choice = sc.nextInt();
		while(true) {
			
			switch(choice)
			{
				case 1: DriverMethods.createAccount(); break;
				case 2: DriverMethods.withdraw(); break;
				case 3: DriverMethods.deposit(); break;
				case 4: DriverMethods.transfer(); break;
				case 5: DriverMethods.checkBalance(); break;
				case 6: DriverMethods.accountDetails(); break;
				default: System.out.println("--*Tata*--*ByeBye*--");System.exit(0);
			}
			System.out.println("\n 1.Create New Account\n 2.Withdraw\n 3.Deposit\n"
					+ " 4.Transfer\n 5.Check Balance\n 6.Account Details");
			choice = sc.nextInt();
		}
	}
	
	
}
