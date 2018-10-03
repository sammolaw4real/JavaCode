package dayFour.OOP;

public class Animal {

	//Class is a blue print
	//Object is the behavior
	String color;
	int age;
	
	void eat() {
		System.out.println("Dog food");
	}
	
	void run() {
		System.out.println("Very fast");
	}
	
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.run();
		dog.eat();
		dog.age = 10;

		Animal cat = new Animal();
		cat.run();
		cat.eat();
	}

}
