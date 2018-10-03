package dayTwo.Expression;

import java.util.Scanner;

public class ArithmeticOperators {

	
	// Basic arithmetic operators are: +, -, *, /, %
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		scan.close();
		
		
		System.out.println("num1 + num2 := " + (num1 + num2));
		System.out.println("num1 - num2 := " + (num1 - num2));
		System.out.println("num1 * num2 := " + (num1 * num2));
		System.out.println("num1 / num2 := " + (num1 / num2));
		System.out.println("num1 % num2 := " + (num1 % num2));

	}

}
									