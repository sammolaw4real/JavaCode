package day.Six.Exception;

import java.util.Scanner;

public class FianllyExample {

	
	
	public static void main(String[] args) {
		myMethod();
		System.out.println(FianllyExample.myMethod());
		
		try {
			int num = 21/0;
		}
		catch (ArithmeticException e) {
			System.out.println("An arithmetic exception occurs");
		}
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("Out of try catch block");
	}

	
	public static int myMethod() {
		Scanner scan = new Scanner(System.in); 
		
		try {
			return 12;
	
		}
		
		finally {
			scan.close();
			System.out.println("this is Finally Block");
		}
		
		
	}
}
