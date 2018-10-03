package day.Six.Exception;

public class CarException {

	void CarCheck(int door, int wheels) throws CarTypeException{
	
		if (door >= 4 && wheels >=4) {
			
			throw new CarTypeException("This is not a normal car"); 
		}
		
	}
	
	public static void main(String[] args) {
		CarException obj = new CarException();
		
		try {
			obj.CarCheck(5, 5);
		} catch (CarTypeException e) {
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}

	}

	
	class CarTypeException extends Exception {
		
		public CarTypeException(String s) {
			super(s);
			
		}
		
	}
	
	
	
	
}
