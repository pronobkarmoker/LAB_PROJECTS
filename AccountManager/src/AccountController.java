public class AccountController {
	public static void main(String[] args) {
		Account savingsAccount = new SavingsAccount(1000);
		
		System.out.println(savingsAccount.modifySavingsBalance());
		
		Account currentAccount = new CurrentAccount(1000);

		System.out.println(currentAccount.modifySavingsBalance());
	}
}
