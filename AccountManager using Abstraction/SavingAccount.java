package Oop;

public class SavingAccount extends Account {

	public SavingAccount(double currentBalance) {
		super(currentBalance);
		super.annualInterestrate = 0.2;
	}
	@Override
	public String getAccountType() {
		return "saving";
	}
	
	
}
