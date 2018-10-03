package dayThree.CoontrolFlow;

public class ForLoopExamples {
	
	//for (initialized: condition: increment or decrement){
	//}

	public static void main(String[] args) {
		
		int num = 10; 
		int sum = 0; 
		int count;
		
		for(count = 1; count <= num; count++) {
			
			sum = sum + count;		
		}
	
	System.out.println(sum);
	
	Desc();
	fibonacci();
	
	}

	public static void Desc() {
		for (int i = 10; i >= 1; i--)
			System.out.println("The value of I is: " + i);
		
	}
	
	public static void fibonacci() {
		int count = 7;
		int num1 = 0;
		int num2 = 1;
		
		for(int i = 1; i <= count; ++i) {
			System.out.println(num1 + " ");
			int sumOfPreTwo = num1 + num2;
			
			num1 = num2;
			num2 = sumOfPreTwo;
		}
	}
	
	
}
 