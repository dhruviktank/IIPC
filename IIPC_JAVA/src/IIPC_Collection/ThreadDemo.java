package IIPC_Collection;

public class ThreadDemo {
	public static void main(String args[]) throws InterruptedException{
		MyClass mc = new MyClass();
		mc.start();
		MyClass1 mc1 = new MyClass1();
		Thread T = new Thread(mc1);
		T.join();
		T.start();
	}
}
class MyClass extends Thread {
	@Override
	public void run() {
		try {
		for(int i=0;i<10;i++) {
			System.out.println(i+"*"+(i+1)+"="+(i*(i+1)));
			Thread.sleep(1000);
		}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
class MyClass1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread executed");
	}
}