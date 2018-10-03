package dayFour.OOP;

public class InheritanceTest extends child{

	//IS-A
	//one to one inheritance
	//one to many inheritance

	public static void main(String[] args) {
		InheritanceTest test = new InheritanceTest();
		test.sumOfall();

	}
}

class child{
	
	int num1 = 10;
	
	int num2 = 10;
	
	public int sumOfall() {
		
		int  sum = num1 + num2;
		System.out.println(sum);
		return sum;
		
		
	}
	
}