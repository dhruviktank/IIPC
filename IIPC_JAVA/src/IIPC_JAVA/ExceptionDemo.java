package IIPC_JAVA;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
      int a,b;
      int arr[] = {10, 20, 40, 30, 50, 90};
      for(int i=0;i<arr.length;i++) {
    	  System.out.println(arr[i]);
      }
      a = 12;
      b=0;
      if(b==0) {
    	  throw new CustomException();
      }
      System.out.println(a/b);
		}catch(ArithmeticException ar) {
			System.out.println("Arithmetic " + ar.getMessage());
		}catch(IndexOutOfBoundsException a) {
			System.out.println("Array Index out of Bound");
		}
		catch(CustomException ce) {
			ce.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("uncaught exception : "+e.getLocalizedMessage());
		}
		System.out.println("Hello World");
	}
}
public class CustomException extends Exception{
	public String toString() {
		return "denomenator cannot be zero";
	}
}