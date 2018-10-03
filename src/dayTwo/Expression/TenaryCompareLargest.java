package dayTwo.Expression;

import java.util.Scanner;


public class TenaryCompareLargest {

	
	//Compare values with largest number
	
	
	public static void main(String[] args) {
		
		
		Scanner val = new Scanner(System.in);
		
		
		int num1 = val.nextInt();
		int num2 = val.nextInt();
		int num3 = val.nextInt();
		
		val.close();
		
		num1 = (num2 > num1)? num2:num1;
		
		num3 = (num3 > num1)? num3:num1;
		System.out.println(num3);

	}

}
