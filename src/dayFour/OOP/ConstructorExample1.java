package dayFour.OOP;

public class ConstructorExample1 {

	private int var; 
	
	public static void main(String[] args) {
		ConstructorExample1 obj = new ConstructorExample1();
		ConstructorExample1 obj2 = new ConstructorExample1(100);
		System.out.println(obj.getValue());
		System.out.println(obj2.getValue());
	}
		
	public ConstructorExample1() {
		this.var = 10;
			
		}

	public ConstructorExample1(int num) {
		this.var = num;
		
	}
	
	public int getValue() {
		return var;
	}
}


