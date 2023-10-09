package BankApplication;
import BancFramework.*;
public class MMBankFactory extends BankFactory{
	public MMSavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		return new MMSavingAcc(accNo, accNm, accBal, isSalary);
	}
	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
	}
}
