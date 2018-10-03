package dayThree.CoontrolFlow;

public class ContinueStatement {

	
	public static void main(String[] args) {
		//ContinueExmple2();
		//ContinueExample3();
		
		for (int i = 0; i <= 10; i++) {
			
			if (i > 4 && i < 9) {
				//System.out.println("Number three");
				continue;
			}
			System.out.println(i);
		}

	}
	
	public static void ContinueExmple2() {
		int counter = 10;
		while(counter >= 0) {
			if (counter == 7) {
				counter--;
				continue;
			}
			System.out.println(counter+" ");
			counter--;
		}
		
			
	}

	public static void ContinueExample3() {
		
		int i = 10;
		do {
			System.out.println(i);
			i--;
			if( i == 7) {
				i--;
				continue;
			}
		}while(i > 0);
		
	}
	
}
