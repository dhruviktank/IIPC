package BancFramework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal){
		this.accBal = accBal;
		this.accNo= accNo;
		this.accBal = accBal;
	}
	public abstract void withdraw(float amount);
	
	public void deposit(float amount) {
	}
	
	@Override
	public String toString() {
		return "";
	}
}
