package day.Six.Exception;

public class CustomException2 {

	void productCheck(int weight) throws InvalidProductException{
		
		if(weight < 100) {
			throw new InvalidProductException ("Product is invalid");
		}
	}

	public static void main(String[] args) {
		CustomException2 obj = new CustomException2();

		try {
			obj.productCheck(160);// play with the data type
			System.out.println("Product is valid");
		} 
		catch (Exception e) {
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}
	}
	

}


class InvalidProductException extends Exception{
	
	public InvalidProductException (String s) {
		
		super(s);
	}
	
}