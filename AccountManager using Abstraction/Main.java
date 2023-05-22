package Oop;

public class Main {

	public static void main(String[] args) {
		Account savingaccount = new SavingAccount(1000);
//		savingaccount.setAnnualInterestrate(0.02);
//		savingaccount.setCurrentBalance(1000);
		System.out.println(savingaccount.modifyAccount()); 
		
		Account currentaccount = new CurrentAccount(1000);
//		currentaccount.setAnnualInterestrate(0.02);
//		currentaccount.setCurrentBalance(1000);
		System.out.println(currentaccount.modifyAccount());

	}

}
