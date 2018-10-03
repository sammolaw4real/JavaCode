package day.Six.Exception;

public class ExampleTwo {

	
	public static void main(String[] args) {
		
		try {
			
			int a [] = new int [7];
			a[4] = 30/0;
			System.out.println("End of try block");
			
		} 
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out side of range of an array");
		}
		
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println("Out side of the try block");
	}

}
