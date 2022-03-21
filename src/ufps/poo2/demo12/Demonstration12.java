package ufps.poo2.demo12;

public class Demonstration12 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-12. Method hiding vs method overriding***\n");
		
		Vehicle12.showMe(); // Vehicle.showMe()-inside the parent class. 
		
		Vehicle12 vehicle = new Bus12();
		
		// Warning:The following method should be accessed in a static way.
		
		vehicle.showMe(); // Vehicle.showMe()-inside the parent class. 
		vehicle.showInstanceMethod(); // Bus.showInstanceMethod()
		
		System.out.println("----------");
		Bus12.showMe();	// Bus.showMe()-inside the child class.
		
		// Warning:The following method should be accessed in a static way. 
		
		Bus12 bus = new Bus12();
		bus.showMe();	// Bus.showMe()-inside the child class. 
		bus.showInstanceMethod();	// Bus.showInstanceMethod()

	}

}
