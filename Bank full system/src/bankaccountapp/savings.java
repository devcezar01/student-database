package bankaccountapp;

public class savings extends Account{

	// listar prop para savings
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// construtor p iniciar savings
	public savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetydepositBox();
	}
	private void setSafetydepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10,  3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	
	// listar tds metodos
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: savings");
		super.showInfo();
		System.out.println(
				"Your savings" + 
				"\nSafety deposit: " + safetyDepositBoxID + 
				"\nSafety box key: " + safetyDepositBoxKey	);
	}
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		
	}
}
