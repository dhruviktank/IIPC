package BankApplication;
import BancFramework.*;

public class MMSavingAcc extends SavingAcc{
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
	}
	@Override
	public void withdraw(float amount) {
	}
	@Override
	public String toString() {
		return "";
	}
}
