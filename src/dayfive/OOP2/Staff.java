package dayfive.OOP2;

public class Staff {

	Aggreagte empAdd;
	StudentClass stuInfo;
	
	
	public Staff(Aggreagte Add, StudentClass Info) {
		
		this.empAdd = Add;
		this.stuInfo = Info;
	}


	public static void main(String[] args) {
		
		Aggreagte ad = new Aggreagte (120, "Fall Church", "PA", "USA");
		StudentClass stu = new StudentClass(123, "Mike", ad);
		Staff st = new Staff(ad, stu);
		System.out.println(st.empAdd);
		System.out.println(st.stuInfo);
	}

}
