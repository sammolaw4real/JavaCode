package day.Eight.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class ComparableDemo {

	

	public static void main(String[] args) {

		ArrayList<EmployeeDemo> list = new ArrayList<>();
		list.add(new EmployeeDemo(1, "Sam", "Smith", "120 main st"));
		list.add(new EmployeeDemo(1, "Nick", "Smith", "120 main st"));
		list.add(new EmployeeDemo(1, "Jack", "Smith", "120 main st"));
		System.out.println(list);

		HashMap<Integer, EmployeeDemo> map = new HashMap<>();
		map.put(1, new EmployeeDemo(1, "Sam", "Smith", "120 main st"));
		System.out.println(map);

	}

}


class EmployeeDemo{
	
	
	int id;
	String Fname;
	String Lname;
	String Address;
	
	
	
	
	public EmployeeDemo(int id, String fname, String lname, String address) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		Address = address;
	}




	@Override
	public String toString() {
		return "EmployeeDemo [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", Address=" + Address + "]";
	}
	
	
	
	
	
}