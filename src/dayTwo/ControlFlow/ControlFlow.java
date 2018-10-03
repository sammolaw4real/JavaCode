package dayTwo.ControlFlow;


public class ControlFlow {

	/*
	 * if statement 
	 * nested if statement
	 * if-else statement
	 * if-else-if 
	 */
	
	
	
	public static void main(String[] args) {
		ControlFlow cf = new ControlFlow();
		cf.getOne(25);
		cf.nestedIf();
		staticMethod();
		cf.ifElseStatement();
		cf.ifElseIfExample();

	}
	
	public static void staticMethod() {
		System.out.println("This is a static method");
	}
	
	public void getOne(int x) {
		
		int num = 70;
		if(num < 100) {
			System.out.println("Number is less than 100");
		}
	}	
	public void nestedIf() {
		
		int num = 70;
		if(num < 50) {
			System.out.println("Number is less than 100");
			
			if(num > 50) {
				System.out.println("Number is greater than 50");
			}
		}
	}
	
	public void ifElseStatement() {
		
		int num = 120;
		if(num < 50) {
			System.out.println("Num is less then 50");
		}
		else {
			System.out.println("Num is greater than or equal to 50");
			
		}
		
	}
	
	public void ifElseIfExample() {
		int num = 1234; 
		
		if(num < 100 && num >= 1) {
			System.out.println("It's two digit number");
		}
		
		else if (num < 1000 && num >= 100) {
			System.out.println("It's three digit number");
		}
		
		else if (num < 10000 && num >= 1000) {
			System.out.println("It's four digit number");

		}
		
		else if (num < 100000 && num >= 10000) {
			System.out.println("It's three digit number");

		}
		
		else {
			System.out.println("number is not between 1 & 99999");
		}
	}
	

}
