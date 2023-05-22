package Oop;

public abstract  class Account {
	protected double annualInterestrate;
	protected double currentBalance;
	
	private String accountType;
	
	
	public Account(double currentBalance) {
		
		this.currentBalance = currentBalance;
		//this.accountType = accountType;
	}

	private double calculatemonthlyinterestrate() {
		return (currentBalance * annualInterestrate )/12;
	}
	
	public double modifyAccount() {
		currentBalance += calculatemonthlyinterestrate();
		return currentBalance;
	}


	public void setAnnualInterestrate(double annualInterestrate) {
		this.annualInterestrate = annualInterestrate;
	}


	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public abstract String getAccountType();
		

	
}
