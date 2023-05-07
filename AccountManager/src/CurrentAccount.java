
public class CurrentAccount extends Account{
	public CurrentAccount(double currentBalance) {
		super(currentBalance);
		super.annualInterestRate = 0.01;
	}

	@Override
	public double modifySavingsBalance() {
		super.currentBalance = super.modifySavingsBalance() - 0.01*super.currentBalance;
		return super.currentBalance;
	}
}
