package dayFour.OOP;

public class Constructor {

	int age;
	String name;
	String address;
	
	/*
	 * 1. Name of the constructor as same as class name
	 * 2. Cannot be void or return any parameters
	 * 3. Constructors are always public
	 */
	
	public Constructor(){
		System.out.println("We are calling no-arg construc.");
	}
	
	public Constructor(int num, String name){
		System.out.println(num +" " + name);
	}
	
	Constructor(String str, int age, String add){
		this.name = str;
		this.address = add;
		this.age = age;
		System.out.println(str + add + age);
	}
	
	public static void main(String[] args) {
		Constructor cont = new Constructor();
		Constructor cont1 = new Constructor(23, "Test");
		Constructor cont2 = new Constructor("name", 25, "120 main st" );

	}

}
