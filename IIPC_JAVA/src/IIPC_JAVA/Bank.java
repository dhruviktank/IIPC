package IIPC_JAVA;

public class Bank {
	public static void main(String args[]) {
		ICICI obj = new ICICI();
		System.out.println(obj.getRateofInterest());
		Bank obj1 = new SBI();
		System.out.println(obj1.getRateofInterest());
		Bank bank = new Bank();
		System.out.println(bank.getRateofInterest());
	}
	public float getRateofInterest() {
		return 5.4f;
	}
}
class ICICI extends Bank{
	@Override
	public float getRateofInterest() {
		return 7.0f;
	}
}
class SBI extends Bank{
	@Override
	public float getRateofInterest() {
		return 7.1f;
	}
}
