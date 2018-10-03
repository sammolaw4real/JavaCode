package dayFour.OOP;

public class JavaConstructor {

	String web;
	

	public JavaConstructor(String web) {
		this.web = web;
	}
	
	public JavaConstructor(JavaConstructor je) {
		web = je.web;
	}

	void disp() {
		System.out.println("Website " + web);

	}

	public static void main(String[] args) {
		JavaConstructor obj1 = new JavaConstructor("JavaLearningCenter");		
		JavaConstructor obj2 = new JavaConstructor(obj1);
		obj1.disp();
		obj2.disp();
	
	}
	
}
