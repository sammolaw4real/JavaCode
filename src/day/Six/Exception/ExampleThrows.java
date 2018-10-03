package day.Six.Exception;

public class ExampleThrows {

	public static void main(String[] args) {
		Example ex = new Example();
		try {
			ex.myMethod(0);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Out side of try block");
	}
	
}

class Example	{
	
	void myMethod() throws ArithmeticException,NullPointerException{
	
		
		
	}
}
