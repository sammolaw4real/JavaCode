package dayOne.DataTypesandOperators;

import java.util.Scanner;

public class equalNumbers {

	
	public static void main(String[] args) {
		
		int num1; 
		int num2; 
		int num3;
		int num4;
		
		Scanner en = new Scanner (System.in);
		
		num1 = en.nextInt();
		num2 = en.nextInt();
		num3 = en.nextInt();
		num4 = en.nextInt();
		
		if (num1 == num2 && num2 == num3 && num2 == num4) {
		
			System.out.println("Number are equal.");
		}
			
		else {
			
		System.out.println("Numbers are not equal");	
		}
	}

}


