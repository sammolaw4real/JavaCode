package day.Six.OOP3;

public class JavaPOJO {

	//Use getters or setters to access the variable
	//Constructors can also access the values.
	
	private int sum;
	private String name;
	private String address;
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "JavaPOJO [sum=" + sum + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
