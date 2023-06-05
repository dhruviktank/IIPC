package IIPC_JAVA;
// first 20 even numbers.
public class program1 {
	public static void main(String[] args) {
		int i=1,count=1;
		while(count<=20) {
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}
}
