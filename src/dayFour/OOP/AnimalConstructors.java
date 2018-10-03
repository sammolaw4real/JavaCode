package dayFour.OOP;


public class AnimalConstructors {

	int Age;
	String Voice;
	String Type;
	
	//Chain constructors: POJO - Plain Old Java Object
	
	public AnimalConstructors() {
		this(8);
	}

	public AnimalConstructors(int age) {
		this(age,"Bark");
	}

	public AnimalConstructors(int age, String voice) {
		this(age, voice, "Dog");
	}

	public AnimalConstructors(int age, String voice, String type) {
		Age = age;
		Voice = voice;
		Type = type;
	}
	
	void disp() {
		System.out.println("Name of Animal: " + Type);
		System.out.println("Voice of Animal: " + Voice);
		System.out.println("Animal's Age: " + Age);
	}
	
	
	public static void main(String[] args) {
		AnimalConstructors an1 = new AnimalConstructors();
		an1.disp();
		
	}
	
	
	
	
}
