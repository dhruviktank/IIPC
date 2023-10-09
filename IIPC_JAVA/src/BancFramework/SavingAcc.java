package BancFramework;

public abstract class SavingAcc extends BankAcc{
	private boolean isSalary;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary =  isSalary;
	}
	@Override
	public void withdraw(float amount) {
	}
	@Override
	public String toString() {
		return "";
	}
	
}
