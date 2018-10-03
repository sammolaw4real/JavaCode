package dayFour.OOP;

class AnimalTest{
	
	public void eat() {
		System.out.println("Animal is eating");
		
	}
}


public class OverRideTest extends AnimalTest {

	public void eat() {
		System.out.println("Dog is eating");
		super.eat();
	}
	
	public static void main(String[] args) {
		OverRideTest obj = new OverRideTest();
		obj.eat();
		
		//AnimalTest obj1 = new AnimalTest();
		//obj1.eat();
	}

}
