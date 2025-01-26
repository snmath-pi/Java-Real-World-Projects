package advoops;

public class Main {
	public static void main(String[] args) {
//		Vehicle v1 = new Vehicle("910DF7", "black", "r8", "audi", 280, 20);
//		v1.setEngine("910");
//		System.out.println("Vehicle is " +v1.getModel() +":" + v1.getCompany() + "{"+v1.getName()+"}"+"\nIt has a speed of"	
//				+": "+v1.getSpeed()+" and a capacity of "+v1.getFuelCapacity());
//		System.out.println(v1.getColor());
//		System.out.println(v1.getCount());
//		/**
//		 * static is something that belongs to a class
//		 * irrespective of the construction/ initialization of the object
//		 */
//		System.out.println(Vehicle.getCount());
		
		Car car = new Car("civic", "black", "2012", "honda", "900", true, false);
		System.out.println(car.getCompany());
		System.out.println(car.getPowerSteering());
		/**
		 * method overloading
		 */
		System.out.println(car.getName()); 
		Vehicle v1 = new Vehicle("910DF7", "black", "r8", "audi", 280, 20);
		Vehicle v2 = new Car("civic", "black", "2012", "honda", "900", true, false);
		System.out.println(v1.polymorphic());
		/**
		 * parent class variable can inherit child class variable
		 */
		System.out.println(v2.polymorphic());
		
	}
}
