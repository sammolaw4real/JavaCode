package dayThree.CoontrolFlow;

public class WhileLoops {

	//While Loop(conditions)
	//{
	//statements
	//}
	 
	
	public static void main(String[] args) {
		
		int i = 10;
		while(i > 1) {
			System.out.println(i);
			i--;
		}
		
		whileLoopWithArray();

	}
	
	public static void whileLoopWithArray() {
		
		int arr[] = {23,32,56,67,89};
		
		int num = 0;
		
		while ( num < arr.length) {
			System.out.println(arr[num]);
		num++;
		}
	}
	
}
	
	

