package day.Six.Exception;


public class findduplicate {

	// String s = "This is another example that shows how the nested try block works.
	// You can see that there are two try-catch block inside main try block's body."

	public static void main(String[] args) {
		
		int count = 1;
		String words = "This is another example that shows how the nested try block works. You can see that there are two try-catch block inside main try block's body.";

		String arr[] = words.split("\\s", 0);

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
					
					System.out.println(arr[j]);
					
					}
					
				}
				
			}
			
		}

	}


