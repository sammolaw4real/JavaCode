package dayfive.OOP2;

public class StaticBinding extends Human{

	//Static binding also known as early binding 
	
	//NB: Static Method always initialize first
	
	public static void walk() {
		
		System.out.println("Boy walks");
	}
	
	
	public void eat() {						//sample of dynamic binding
		System.out.println("Boy eats");
	}
	
	public static void main(String[] args) {
		
		Human obj = new StaticBinding();
		
		Human obj1 = new Human();
		
		obj.walk();
		obj1.walk();
		obj.eat();
		obj1.eat();
		
	}

}

class Human{
	
	public static void walk() {				//Sample of static binding
		
		System.out.println("Human walks");
	}
	
	public void eat() {						//sample of dynamic binding
		System.out.println("Human eats");
	}
}


