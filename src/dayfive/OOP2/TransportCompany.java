package dayfive.OOP2;

public class TransportCompany {

	//This is the example of Association in Java
	
	public static void main(String[] args) {
	
		Driver obj = new Driver("Ford", 12, "Andy");
		System.out.println(obj.driverName + " is Driver of car number: " + obj.carId);

	}
}
	
	class CarClass{
		
		String carName;
		int carId;
		public CarClass(String carName, int carId) {
			super();
			this.carName = carName;
			this.carId = carId;
		}
		
	}

	class Driver extends CarClass{
		
		String driverName;

		public Driver(String carName, int carId, String driverName) {
			super(carName, carId);
			this.driverName = driverName;
		}
		
		
		
	}
