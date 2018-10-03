package day.Six.OOP3;

public class SampleTestClass implements SampleInterface {

	//SampletestClass is called the concrete. Any class you can create an instance is called Concrete class.
	
	
	@Override
	public void methodOne() {
		System.out.println();
		
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		
	}
	
	void methodThree() {
		// TODO Auto-generated method stub

	}
	
	
	public static void main(String[] args) {
		
		SampleInterface obj3 = new SampleTestClass();
		
		obj3.methodOne();
		obj3.methodTwo();

	}

	
}
