package IIPC_JAVA;

import java.util.Arrays;

public class jaggedArray {
	public static void main(String args[]) {
		int[][] jarray = new int[4][];
		jarray[0] = new int[2];
		jarray[1] = new int[5];
		jarray[2] = new int[1];
		jarray[3] = new int[3];
		int i = 0;
		for(int j=0;j<jarray.length;j++) {
			for(int k=0;k<jarray[j].length;k++) {
				jarray[j][k] = i;
				i++;
			}
		}
		for(int j=0;j<jarray.length;j++) {
			for(int k=0;k<jarray[j].length;k++) {
				System.out.print(jarray[j][k] + " ");
			}
			System.out.println();
		}
	}
}
