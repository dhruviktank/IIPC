package IIPC_JAVA;

public class smallestandLargest {
	public static void main(String args[]) {
		int[] arr = {10, 30, 4, 6, 20, 70};
		int min = arr[0], max = arr[0];
		for(int element:arr){
			if(element < min) {
				min = element;
			}
			if(element > max) {
				max = element;
			}
		}
		System.out.println("Largest : "+max);
		System.out.println("Smallest : "+min);
	}
}
