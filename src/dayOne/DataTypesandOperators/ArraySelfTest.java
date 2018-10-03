package dayOne.DataTypesandOperators;

import java.util.Arrays;

import java.util.Scanner;

public class ArraySelfTest {

	
	
	public static void main(String[] args) {
		
		duplicateStrings(); 
		//numberOfRows();
		
		/*int arr[] = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 
				         2165, 1457, 2456};

		
		
		String str[] = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
		
		System.out.println("Oroginal numeric array : "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Oroginal numeric array : "+Arrays.toString(arr));
		
		System.out.println("Oroginal numeric array : "+Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("Oroginal numeric array : "+Arrays.toString(str));*/

	}
	
	public static void duplicateStrings() {
		
		String str1[] = {"bcd", "abd", "jude", "bcd", "olu", "gzw", "olu"};
		
		for (int i = 0; i < str1.length-1; i++) {
			
			for (int j = i + 1; j < str1.length; j++) {
				
				if ((str1[i].equals(str1[j]))&&(i!=j)) {
					System.out.println("Duplicate Elements are :" + str1[j]);
				}
			}
		}
		
			
	}
	/*public static void numberOfRows() {
		
		int user;
		
		Scanner nor = new Scanner(System.in);
		user = nor.nextInt();
		
		for (int i = 1; i <= user; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);	
			}
			System.out.println(" ");
		}
		
	}*/
	
}
