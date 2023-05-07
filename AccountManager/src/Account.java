
public class Account {
	protected double annualInterestRate;
	protected double currentBalance;
	
	public Account(double currentBalance) {
		this.currentBalance = currentBalance;
		
	}
	private double calculateMonthlyInterest() {
		return (currentBalance * annualInterestRate) / 12;
	}

	public double modifySavingsBalance() {
		currentBalance += calculateMonthlyInterest();
		return currentBalance;
	}

	public void setInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

}
