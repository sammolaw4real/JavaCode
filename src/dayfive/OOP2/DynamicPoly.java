package dayfive.OOP2;

public class DynamicPoly {

	//Dynamic Polymorphism
	
	public static void main(String[] args) {
		
		PolymorDy obj = new PolymorDy();
		obj.myMethod();
		
		DynamicPoly obj1 = new DynamicPoly();
		obj1.myMethod();

	}
	
	
	public void myMethod() {
		System.out.println("this the child class");
	}
	
}


class PolymorDy{
	
	public void myMethod() {
		System.out.println("From super class");
	}
}