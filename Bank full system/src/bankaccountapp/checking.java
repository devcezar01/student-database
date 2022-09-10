package bankaccountapp;

public class checking extends Account{
	// listar propriedades especif para chek conta
	private int debitCardNumber;
	private int debitCardPIN;
	
	// construtor p inicar contas
	public checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();

	}
	
	public void setRate() {
		rate = getBaseRate() * .15;
	};
	
	
	// listar td metodo p check acount
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10,  12));
 		debitCardPIN = (int) (Math.random() * Math.pow(10,  12));;
 		
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checking" + 
		"\nDebid card number " + debitCardNumber + 
		"\nDebit card PIN " + debitCardPIN
		);
	}
}
