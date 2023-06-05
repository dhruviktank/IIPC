package IIPC_JAVA;
import java.util.Scanner;
public class program2 {
//find big numbers.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(bigNumber(a,b));
	}
	static int bigNumber(int a, int b) {
		return (a>b)?a:b;
	}

}
