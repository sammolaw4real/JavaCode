package day.Six.Exception;

public class ExampleException {

	
	public static void main(String[] args) {
			
			try {
				
				
				try {
					
					System.out.println("Inside block1");
					int b  = 45/0;
					System.out.println(b);
					System.out.println("Inside block2");
				}
				
				catch(ArithmeticException e1) {
					System.out.println("Exception: e1");
					
				}
				
				try {
					System.out.println("Inside block2");
					int b = 35/0;
					System.out.println(b);
				}
				catch(ArithmeticException e2) {
					System.out.println("Arithmetic Exception");
				}
				
				
			}catch(ArithmeticException e){
				System.out.println("Inside parent try catch blcok");
				
			}
			
		 
		
		System.out.println("Next Statement");

	}

}


