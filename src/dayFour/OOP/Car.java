package dayFour.OOP;



public class Car {

	//Create car class
	//5 variables wheels,color, model, door, engineType	
	//Three cars but they should have different parameter values
	
	int Wheels;
	int Door;
	static String Color;
	String Model;
	String engineType;
	
	
	public Car(int wheels, int doors, String color, String model, String engineType) {
		
		this.Wheels = wheels;
		this.Door = doors;
		this.Color= color;
		this.Model = model;
		this.engineType = engineType;
		//System.out.println(car1.toString());
	
		
	}
	
	public static String getAll() {
		return Color;
	}
	
	public static String setColor(String carColor) {
		Color = carColor;
		return Color;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car(4, 2, "Red", "Toyota", "6 Cylinder");
		Car car2 = new Car(2, 4, "Black", "Honda", "4 Cylinder");
		
		System.out.println(car1);
		System.out.println(car2);
		
		System.out.println(getAll());
		System.out.println(setColor("blue"));

	}

	@Override
	public String toString() {
		return "Wheels: " + Wheels + ", Door: " + Door + ", Model: " + Model + ", engineType: " + engineType;
	}

}
