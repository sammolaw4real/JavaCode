package dayfive.OOP2;

public class StudentClass {

	//Association
	int rollnum;
	String stuName;
	Aggreagte stuAddress;
	
	
	public StudentClass(int rollnum, String stuName, Aggreagte stuAddress) {
		
		this.rollnum = rollnum;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
	}

	public static void main(String[] args) {
		
		Aggreagte ad = new Aggreagte(120, "Fall Church", "PA", "USA");
		StudentClass obj = new StudentClass(123, "Mike", ad);
		System.out.println(obj);
		System.out.println(obj.rollnum);
		System.out.println(obj.stuName);
		System.out.println(obj.stuAddress.streetName + " " + obj.stuAddress.city);
		System.out.println(obj.stuAddress.state + " " + obj.stuAddress.country);
	}

	@Override
	public String toString() {
		return "StudentClass [rollnum=" + rollnum + ", stuName=" + stuName + ", stuAddress=" + stuAddress + "]";
	}

	
}
