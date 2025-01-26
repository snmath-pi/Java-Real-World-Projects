package advoops;

public class Vehicle {
	private String name;
	private String color;
	private String model;
	private String company;
	private int speed;
	private int fuelCapacity;
	private String engine = "800";
	public static int count = 200;
	/**
	 * constructor overloading
	 * being done by making three different types of constructors
	 * they all take different parameters
	 */
	public Vehicle() {
		
	}
	
	public Vehicle(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	public Vehicle(String name, String color, String model, String company, int speed, int fuelCapacity) {
		this.name = name;
		this.color = color;
		this.model = model;
		this.company = company;
		this.speed = speed;
		this.fuelCapacity = fuelCapacity;
	}
	public Vehicle(String name, String color, String model, String company, String engine) {
		this.name = name;
		this.color = color;
		this.model = model;
		this.company = company;
		this.engine = engine;
	}
	
	
	/**
	 * this function is used to set: 
	 * @param name 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * this function is used to
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	/**
	 * 
	 * @param company
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	/**
	 * 
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		
		String a = getEngine();
		if(a == "800") {
			return 120;
		} else {
			return 200;
		}
	}
	/**
	 * 
	 * @param fuelCapacity
	 */
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	
	/**
	 * 
	 * @return engine
	 */
	private String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public static int getCount() {
		return count;
	}
	
	public String polymorphic() {
		return "This is a vehicle";
	}
	
	
	
}
