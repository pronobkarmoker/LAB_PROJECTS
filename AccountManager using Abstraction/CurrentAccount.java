package Oop;

public class CurrentAccount extends Account {
	
	
	
	public CurrentAccount(double currentBalance) {
		super(currentBalance);
		super.annualInterestrate = 0.01;
	}

	@Override
	public double modifyAccount() {
		super.currentBalance += super.modifyAccount()- 0.02 * super.currentBalance ;
		return super.currentBalance;
	}
	@Override
	public String getAccountType() {
		return "current";
	}
}
