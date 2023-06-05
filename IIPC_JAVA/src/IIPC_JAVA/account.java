package IIPC_JAVA;
import java.util.Scanner;
//Program 5
public class account {
	public static void main(String[] args) {
		accountDetail[] members = new accountDetail[3];
		members[0] = new accountDetail("John",15000);
		members[1] = new accountDetail("Marry",20000);
		members[2] = new accountDetail();
		for(accountDetail x: members) {
			x.display();
		}
	}
}

class accountDetail{
	private String AccountHolderName;
	Scanner sc = new Scanner(System.in);
	private int Balance;
	
	accountDetail(){
		this.AccountHolderName = sc.nextLine();
		this.Balance = sc.nextInt();
	}
	
	accountDetail(String name, int balance){
		this.AccountHolderName = name;
		this.Balance = balance;
	}
	
	void setDetail(String name, int balance) {
		if(balance<Balance) {
			System.out.println("not sufficient balance");
		}
		else
		if(balance>=10000) {
			Balance = balance;
		}
		else {
			System.out.println("minimum balance should be 10000");
		}
		AccountHolderName = name;
	}
	
	String getName() {
		return AccountHolderName;
	}
	
	int getBalance() {
		return Balance;
	}
	
	void withdraw(int amount) {
		if(Balance-amount>=10000) {
			Balance = Balance - amount;
		}
		else {
			System.out.println("After withdraw amount getting less than 10000");
		}
	}
	
	void deposit(int amount) {
		Balance = Balance + amount;
	}
	
	void display() {
		System.out.println("Name : "+AccountHolderName);
		System.out.println("Balance : "+Balance+"\n");
	}
}
