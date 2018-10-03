package dayfive.OOP2;

public class Polymorphism {

	//This class is an example of Static and dynamic polymorphism
	//It is similar to Overloading
	
	public static void main(String[] args) {
		
		SimpleCal obj = new SimpleCal();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20,30));

	}

}

class SimpleCal{
	int add(int a, int b) {
		return a + b;
		
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
		
	}
}