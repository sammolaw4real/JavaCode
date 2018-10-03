package dayThree.CoontrolFlow;

public class ReturnStatements {

	
	
	public static void main(String[] args) {
		sumOfDouble(23.99, 43.12);
		System.out.println(sumOfDouble(23.99, 43.12));

	}
	
	static double sumOfDouble(double a, double b) {
		
		double sum = a + b;
		//System.out.println(sum);
		return sum;
	}

}
