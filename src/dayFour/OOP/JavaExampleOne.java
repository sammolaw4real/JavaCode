package dayFour.OOP;


class SuperClass{
	
	public SuperClass() {
		System.out.println("This is from super class");
		
	}
	
	void disp() {
		System.out.println("Super Class Method");
		
	}
	
}


public class JavaExampleOne extends SuperClass{

	public JavaExampleOne() {
		System.out.println("Child Class constructor");
	}
	
	void disp() {
		System.out.println("Child Class Method");
		super.disp();
	}
	
	public static void main(String[] args) {
		JavaExampleOne obj = new JavaExampleOne();
		obj.disp();
	}

}
