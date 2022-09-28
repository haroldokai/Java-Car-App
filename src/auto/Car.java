package auto;

public class Car {
	
	private String make;
	private String model;
	private int year;
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year =  year;
	}
	
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	public String setCarMake(String make) {
		
		this.make = make;
		return make;
	}
	
	public String setCarModel(String model) {
		this.model = model;
		return model;
	}
	
	public int setCarYear(int year) {
		this.year = year;
		return year;
	}
	
	
	
	public int getCarYear() {
		return year;
	}
	
		public String getCarMake() {
		return make;
	}

		public String toString() {
		return "Car make: " + make + ", model: " + model + ", Car Year: " + year;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Car Java Application");
		
		Car car1 = new Car("Ford", "F150", 2015);
		Car car2 = new Car("Chevy", "Corvette", 2018);
		Car car3 = new Car("Jeep", "Rubicon", 2020);
		
		Options opt1 = new Options("Satelite", "AutoDrive", "FlexFuel");
		Options opt2 = new Options("Terestrial", "standard", "Gas");
		Options opt3 = new Options("Satelite", "standard", "DualFuel"); 
		
		System.out.println(car1.toString());
		System.out.println(opt1.toString());
		
		System.out.println(car2.toString());
		System.out.println(opt2.toString());
		
		
		System.out.println(car3.toString());
		System.out.println(opt3.toString());

	}

}
