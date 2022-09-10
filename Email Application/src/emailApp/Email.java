package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";

	// construtor p nome
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	
	
	// chamar o metodo perguntando ao dep
	this.department = setDepartment();
	
	// metodo p senha random
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Your password is: " + this.password);
	
	// combina elementos p gerar email
	email = firstName.toLowerCase() + "." + lastName.toLowerCase() + '@' + department + companySuffix;
	
	}
	
	//perg ao dpartment
		private String setDepartment() {
			System.out.println("New worker: " + firstName + " . Department Codes:\n1 for sales\n2 for dev\n3 for Accounting\n0 for none\nEnter department code: ");
			Scanner in = new Scanner(System.in);
			int depChoice = in.nextInt();
			if (depChoice == 1) { return "sales";}
			else if (depChoice == 2) { return "dev";}
			else if (depChoice == 3) { return "acct";}
			else { return " ";}
	}
	
	//gerar pass
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXWYZ1234567890!@#$%&";
			char[] password = new char [length];
			for(int i=0; i<length; i++) {
				int rand =(int) (Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
				
			}
			return new String(password);
		}
	
	//mudar mailbox
		public void setMailboxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
	
	//set email
		public void setAternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
	
	//change pass
		public void changePassword(String password) {
			this.password = password;
		}
		
		public int getMailboxCapacity() { return mailboxCapacity; }
		public String getAlternateEmail() { return alternateEmail; }
		public String getPassword() { return password; }
		
		public String showInfo() {
			return "DISPLAY NAME: " + " " + lastName + 
					"\nCOMPANY EMAIL: " + email + 
					"\nMAILBOX CAPCITY: " + mailboxCapacity + "mb";
			}
}








