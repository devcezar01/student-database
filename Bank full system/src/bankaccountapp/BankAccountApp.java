package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		
		String file = "C:\\Users\\Augusto\\Downloads\\NewBankAccounts.CSV";		
		List<String[]> newAccountHolders = utilites.CSV.read(file);
		for (String[] AccountHolder : newAccountHolders) {
			String[] result = 
			AccountHolder[0].split(",");
			String name = result [0];
			String sSN = result[1];
			String accountType = result[2];
			System.out.println("NEW ACCOUNT");
//			String name = AccountHolder[0];
//			String sSN = AccountHolder[1];
//			String accountType = AccountHolder[2];
			
			double initDeposit = Double.parseDouble((result)[3]);
			if (accountType.equals("savings")) {
				accounts.add(new savings(name, sSN, initDeposit));
			} 
			else if(accountType.equals("checking")) {
				accounts.add(new checking(name, sSN, initDeposit));
			} 
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for (Account acc: accounts) {
			System.out.println("****************");
			acc.showInfo();
		}
		
		}
	}


