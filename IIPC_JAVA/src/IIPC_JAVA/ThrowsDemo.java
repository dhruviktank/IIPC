package IIPC_JAVA;

public class ThrowsDemo {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			methodWithThrow();
		}
		 static void methodWithThrow()
		    {
		    try
		    {
		    	ArithmeticException ae = new ArithmeticException();
		    	int a = 11;
		    	if(a % 2 == 1) {
		    		throw ae;
		    	}
	        }
	        catch(ArithmeticException ex)
	        {
	            System.out.println("Number is odd");
	            System.out.println(ex.getMessage());
	        }
	    }
}
