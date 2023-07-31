package IIPC_JAVA;

public class WrapperClassDemo {
	public static void main(String args[]) {
		int a = 10;
		Integer b = a;
		Integer c = Integer.valueOf(a);
		Integer d = Integer.parseInt("100");
		System.out.println(a + " " + b + " " + c + " " + d);
		int n = b.intValue();
		System.out.println(n);
	}
}
