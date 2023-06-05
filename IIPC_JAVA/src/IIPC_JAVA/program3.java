package IIPC_JAVA;

public class program3 {
	public static void main(String[] args) {
		int a=50,b=89,c=78,d=90;
		int avg = (a+b+c+d)/4;
		if(avg>90) {
			System.out.println("Grade A");
		}
		else if(avg>80) {
			System.out.println("Grade B");
		}
		else if(avg>70) {
			System.out.println("Grade C");
		}
		else if(avg>60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade E");
		}
		
	}
}
