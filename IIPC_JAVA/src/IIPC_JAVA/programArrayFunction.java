package IIPC_JAVA;
import java.util.Arrays;
import java.util.Scanner;
public class programArrayFunction {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Welcome--------");
		System.out.println("1. Sorting\n2. Total of all elements\n3. Merging two Array");
		System.out.println("-----------------------");
		System.out.println("Enter Operation Number");
		int operation = sc.nextInt();
		switch(operation) {
		case 1:
			int[] arr = getArray();
			Arrays.sort(arr);
			System.out.println("Sorted array: "+Arrays.toString(arr));
			break;
		case 2:
			int[] arr1 = getArray();
			int sum = 0;
			for(int i:arr1) {
				sum+=i;
			}
			System.out.println("Total of all elements: "+sum);
			break;
		case 3:
			int[] arr2 = getArray();
			int[] arr3 = getArray();
			int[] mergearr = new int[arr2.length + arr3.length];
			int i=0;
			for(int element:arr2) {
				mergearr[i] = element;
				i++;
			}
			for(int element:arr3) {
				mergearr[i] = element;
				i++;
			}
			System.out.println("Merged array : "+Arrays.toString(mergearr));
			break;
		default:
			System.out.println("Enter valid operation");
		}
		sc.close();
	}
	public static int[] getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter space separated array element: ");
		String str = sc.nextLine();
		str.trim();
		String[] arr = str.split(" ");
		int[] arr1 = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i] = Integer.parseInt(arr[i]);
		}
		return arr1;
	}
}
