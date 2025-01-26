package advoops;

public class Bike extends Vehicle {
	private boolean fourStroke = false;
	public Bike(String name, String color,String model, String company, String engine, boolean fourStroke) {
		super(name, color, model, company, engine);
		this.fourStroke = fourStroke;
	}
	public void setFourStroke(boolean fourStroke) {
		this.fourStroke = fourStroke;
	}
	
	public boolean getFourStroke() {
		return fourStroke;
	}
	public String polymorphic() {
		return "This is a bike";
	}
}
