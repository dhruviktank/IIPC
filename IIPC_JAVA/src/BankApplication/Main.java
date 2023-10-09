package BankApplication;
import BancFramework.*;
public class Main {
	public static void main(String args[]) {
		BankFactory bankFactory = new MMBankFactory();
		SavingAcc savingAcc = new MMSavingAcc(101, "Dhruvik", 10000, false);
		CurrentAcc currentAcc = new MMCurrentAcc(102, "Apeksha", 5000, 100000);
		savingAcc.withdraw(12000);
		savingAcc.deposit(1000);
		System.out.println(savingAcc.getAccBal());
	}
}
