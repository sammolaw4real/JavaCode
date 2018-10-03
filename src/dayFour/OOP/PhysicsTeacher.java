package dayFour.OOP;


class Teacher{
	
	String designation = "Teacher";
	String nameOfDept = "Technical";
	
	void does(){
		System.out.println("Teach");
		
	}
	
	//constructor
	public Teacher() {
		System.out.println("From Parent class");
	}
	
}

public class PhysicsTeacher extends Teacher {

	public PhysicsTeacher() {
		super();
		System.out.println("This is child class");
	}
	
	String mainSub = "Physics";
	
	
	
	public static void main(String[] args) {
		
		PhysicsTeacher obj = new PhysicsTeacher();
		System.out.println(obj.designation);
		System.out.println(obj.nameOfDept);
		System.out.println(obj.mainSub);
		obj.does();
		
		new PhysicsTeacher();
		
	}

}
