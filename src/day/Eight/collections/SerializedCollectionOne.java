package day.Eight.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializedCollectionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Employee> empList = new ArrayList<>();
 		empList.add(new Employee(1, "Mike", "Smith"));
		empList.add(new Employee(2, "Steve", "Smith"));
		empList.add(new Employee(3, "Brian", "Motto"));
 		try {
			FileOutputStream fileOutputStream = new FileOutputStream("EmpNameList.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(empList.toString());
			objectOutputStream.close();
			fileOutputStream.close();
 		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		readFromEmpList();
		
		
		
	}
	
	public static void readFromEmpList() {
		ArrayList<Employee> empRead = new ArrayList<>();
		try (FileInputStream fileInputStream = new FileInputStream("EmpNameList.txt")){
			
			
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			
			empRead = (ArrayList) inputStream.readObject();
			inputStream.close();
			fileInputStream.close();
			
			for(Employee emp : empRead) {
				System.out.println(emp);
			}
			
		}
		catch (Exception e) {
			System.out.println("File not found");
			return;
		}
		
		
		
	}

}

class Employee implements Serializable {
 	int id;
	String firstName;
	String lastName;
 	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
 	@Override
	public String toString() {
		return "Empoyee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
 }
