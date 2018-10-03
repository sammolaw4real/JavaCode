package day.Six.Exception;

public class ThrowExample {

	
	public static void main(String[] args) {
		checkEligibility(10,39);

	}

	
	static void checkEligibility(int stuAge, int stuWeight) {
		
		if (stuAge < 12 && stuWeight < 40) {
			throw new ArithmeticException("Student is not eligible");
		}
		
		else {
			System.out.println("Student is eligible");
		}
	}
}
