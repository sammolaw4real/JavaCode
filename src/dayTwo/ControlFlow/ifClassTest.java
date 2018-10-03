package dayTwo.ControlFlow;

import java.util.Scanner;

public class ifClassTest {

	
	public static void main(String[] args) {
		
		float num1;
		
		Scanner user = new Scanner (System.in);
		
		num1 = user.nextFloat();
		
		if (num1 > 0) {
			if(num1 < 1 ) {
				System.out.println("Positive small number");
			}
			else if (num1 > 1000000) {
				System.out.println("Positive large number");
			}
			else {
				System.out.println("Positive number");
			}
		}
		
		else if (num1 < 0){
			if(Math.abs(num1) < 1) {
				System.out.println("Negative small number");
			}
			else if (Math.abs(num1) > 1000000){
				System.out.println("Negative large number");	
			}
			else {
				System.out.println("Negative number");
			}
		}
		
		else {
			System.out.println("Zero");
		}

	}

}
