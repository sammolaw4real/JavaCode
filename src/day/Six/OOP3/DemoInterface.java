package day.Six.OOP3;

public class DemoInterface implements MyInterface, MyInterface2  {

	//Practice of Interface...
	
	
	
	public static void main(String[] args) {
		
		MyInterface obj = new DemoInterface();
		obj.method1();
		obj.method2();
		
		MyInterface2 obj1 = new DemoInterface();
		obj1.method3();
		obj1.method1();
		obj1.method2();

	}

	@Override
	public void method1() {
		System.out.println("Implementation of method1");
		
	}

	@Override
	public void method2() {
		System.out.println("Implementation of method2");
		
	}

	@Override
	public void method3() {
		System.out.println("Implementation of method3");

		
	}

}


interface MyInterface{
	
	public void method1();
	
	public void method2();
	
}

interface MyInterface2 extends MyInterface {
	
	public void method3();
}