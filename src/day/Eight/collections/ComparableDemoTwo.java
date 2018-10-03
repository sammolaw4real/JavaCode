package day.Eight.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemoTwo {

	
	
public static void main(String[] args) {
		
		ArrayList<Car> carType = new ArrayList<>();
		carType.add(new Car(1, "X", "Black", 2));
		carType.add(new Car(2, "X", "Red", 4));
		carType.add(new Car(3, "Y", "White", 2));
		carType.add(new Car(4, "Y", "Red", 4));
		carType.add(new Car(5, "3", "Black", 4));
		
		
		Collections.sort(carType);
		
		for(Car ct : carType) {
			
			System.out.println(ct.id + " " + ct.fName + " " + ct.lName+ " " + ct.door);
		}
 
	}

}


class Car implements Comparable<Car>{
	
	int id;
	String fName;
	String lName;
	int door;


	public Car(int id, String fName, String lName, int door) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.door = door;
	}


	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		
		int last = this.lName.compareTo(o.lName);
		return last == 0 ? this.fName.compareTo(o.fName) : last;
	}

	
}
