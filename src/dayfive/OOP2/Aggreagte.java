package dayfive.OOP2;

public class Aggreagte {

	//HAS-A
	//it allows to determine HAS-A relationship with other class
	
	int streetName;
	String city;
	String state;
	String country;
	
	public Aggreagte(int streetName, String city, String state, String country) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "Aggreagte [streetName=" + streetName + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}

	
}
