package IIPC_JAVA;

import java.util.Arrays;
import java.util.Collections;
public class ArrayFunction {
	public static void main(String args[]) {
		int[] a = {10, 20, 30, 40};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 3));
		int[] b = {23, 43, 0, 1, 2, 3};
		boolean k = Arrays.equals(a,  a);
		int j = Arrays.compare(a, a);
		System.out.println(j); 
		int[] c = Arrays.copyOf(b, 4);
		System.out.println(Arrays.toString(a));
	}
}
