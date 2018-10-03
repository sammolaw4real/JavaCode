package day.Eight.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemoOne {

	
	
	public static void main(String[] args) {
		
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("Henry", "Miller", "100 Main st"));
		personList.add(new Person("Nalo", "Hopkins", "300 Main st"));
		personList.add(new Person("Frank", "Miller", "200 Main st"));
		personList.add(new Person("Deborah", "Hopkins", "400 Main st"));
		personList.add(new Person("George", "Martin", "160 Main st"));
		
		
		Collections.sort(personList);
		
		for(Person pl : personList) {
			
			System.out.println(pl.fName + " " + pl.lName+ " " + pl.address);
		}

	}

}


class Person implements Comparable<Person>{
	

	String fName;
	String lName;
	String address;
	
	
	
	public Person(String fName, String lName, String address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}


	@Override
	public int compareTo(Person o) {
		
		int last = this.lName.compareTo(o.lName);
		return last == 0 ? this.fName.compareTo(o.fName) : last;
	}
		
	
	
}




