package day.Six.Exception;

public class CustomeExceptions {

	
	
	public static void main(String[] args) {
	
		try {
			System.out.println("Try catch block");
			throw new MyException("This is an error message");
		}
		catch(MyException e) {
			System.out.println("This is catch block");
			System.out.println(e);
		}
		System.out.println("Out side of try catch block");
	}

}


class MyException extends Exception{
	
	String str1;
	
	public MyException(String str2) {
		this.str1 = str2;
	}

	@Override
	public String toString() {
		return "MyException [str1=" + str1 + "]";
	}
	
	
	
}