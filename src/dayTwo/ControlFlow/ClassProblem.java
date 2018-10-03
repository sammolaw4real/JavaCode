package dayTwo.ControlFlow;

import java.util.Scanner;

public class ClassProblem {
	//Using if else statements
	//1. Out of three numbers find the largest number.
	//2. For any number positive or negative, print out the result.
	//3. Find the numbers even or odd.
	
	
	public static void main(String[] args) {
		
		ClassProblem cm = new ClassProblem();
		cm.largestNumber();
		System.out.println("Press enter key for the next task");
		cm.signDetect();
		System.out.println("Press enter key for the next task");
		cm.EvenOdd();
		System.out.println("Bye for now");
		
	}
	
	public void largestNumber() {
		Scanner lm = new Scanner (System.in);
		
		System.out.println("Supply your first value");
		int num1 = lm.nextInt();
		
		System.out.println("Supply your second value");
		int num2 = lm.nextInt();
		
		System.out.println("Supply your third value");
		int num3 = lm.nextInt();
		
		
		if (num1 > num2 && num1 > num3) {
			System.out.println( num1 + " is the largest value");
		}
		
		else if (num2 > num1 && num2 >num3) {
			System.out.println( num2 + " is the largest value");
		}
		
		else if (num3 > num1 && num3 >num2) {
			System.out.println( num1 + " is the largest value");
		}
		
		else {
			System.out.println("All values supplied are the same");
		}		
	}
	
	public void signDetect(){
		
		Scanner sd = new Scanner (System.in);
		
		int num1 = sd.nextInt();
		
		if (num1 >= 0) {
			System.out.println( num1 + " is a positive value");
		}
		else {
			System.out.println( num1 + " is a negative value");
		}	
	}
	
	public void EvenOdd() {
		
		Scanner eo = new Scanner (System.in);
		
		int num1 = eo.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println( num1 + " is an even number");
		}
		else {
			System.out.println( num1 + " is an odd number");
		}	
		eo.close();
	}
}