package day.Six.Exception;



public class ExceptionClassWork {

	
	
	public static void main(String[] args) {
		
		
		try {
		
			System.out.println("Inside block2");
		
		}
		
		catch(ArithmeticException e1) {
			System.out.println("Exception: e1");
		}
		
		finally {
			System.out.println("finally block");
			int x = 5/0;
			
		}

	}

}
