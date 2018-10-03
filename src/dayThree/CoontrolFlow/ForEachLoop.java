package dayThree.CoontrolFlow;

public class ForEachLoop {

	
	
	public static void main(String[] args) {
	
		int arr[] = {23,45,67,89};

		for (int i = 0; i<arr.length; i++) {
			//System.out.println(arr[i]);
			System.out.println(i);
		}
		
		//for each or enchanced for loop
		for (int num : arr) {
			System.out.println("this is for each loop: " + num);
		}
		
		String str[] = {"Hello", "Sample", "Test"};
		
		for (String str1 : str) {
			System.out.println(str1);
		}
	}

}
