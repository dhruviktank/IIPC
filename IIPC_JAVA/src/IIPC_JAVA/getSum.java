package IIPC_JAVA;

public class getSum {
	public static void main(String args[]) {
		System.out.println(getSumOf(10, 20, 30, 40, 50));
	}
	public static int getSumOf(int... n) {
		int sum = 0;
		for (int no : n)
			sum += no;
		return sum;
	}
}
