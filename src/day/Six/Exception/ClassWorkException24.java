package day.Six.Exception;

public class ClassWorkException24 {

	
	
	public static void main(String[] args) {
		
		//ClassWorkException obj = new ClassWorkException();
		
		
		int x;
		int [] x1 = new int []{2,5,6,7};
		
		
		try {
			x = 30/0;
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}	
	
		try {
			
			x1[4] = 5;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception ");
		}
		
		try {
			
			int num=Integer.parseInt ("XYZ") ;
			 System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occurred");

		}
		
		try{
			 String str="beginnersbook";
			 //System.out.println(str.length());;
			 char c = str.charAt(0);
			 c = str.charAt(14);
			 System.out.println(c);
		      }catch(StringIndexOutOfBoundsException e){
			  System.out.println("StringIndexOutOfBoundsException!!");
		       }
	}
	
	
}
