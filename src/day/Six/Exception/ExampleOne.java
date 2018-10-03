package day.Six.Exception;

public class ExampleOne {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		try {
			
			num1 = 0;
			num2 = 12/num1;
			System.out.println(num2);
			System.out.println("This ");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
