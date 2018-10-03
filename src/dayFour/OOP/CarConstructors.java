package dayFour.OOP;

public class CarConstructors {

	String Color;
	int Wheels;
	int Door;

	//Chain Constructors

	public CarConstructors() {
		this("Teal");
	}

	public CarConstructors(String color) {
		this(color, 4);
	}
	
	public CarConstructors(String color, int wheels) {
		this(color, wheels, 2);
	}
	
	public CarConstructors(String color, int wheels, int door) {
		this.Color = color;
		this.Wheels = wheels;
		this.Door = door;
	}

	void disp() {
		System.out.println("Color of car: " + Color);
		System.out.println("How many wheels: " + Wheels);
		System.out.println("How many doors: " + Door);
	}

	public static void main(String[] args) {
		CarConstructors car = new CarConstructors();
		car.disp();
	
	}
	
	
	
	
}
