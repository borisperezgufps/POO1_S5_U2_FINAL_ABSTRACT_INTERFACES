package ufps.poo2.demo12;

import java.util.Calendar;

public class Demonstration12 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-12. Method hiding vs method overriding***\n");
		
		Vehicle12.showMe(); // Vehicle.showMe()-inside the parent class. 
		
		Vehicle12 vehicle1 = new Bus12();
		Vehicle12 vehicle2 = new Car12();
		
		// Warning:The following method should be accessed in a static way.
		
		vehicle1.showMe(); // Vehicle.showMe()-inside the parent class.
		vehicle2.showMe();
		vehicle1.showInstanceMethod(); // Bus.showInstanceMethod()
		
		System.out.println("----------");
		Car12.showMe();
		
		System.out.println("----------");
		Bus12.showMe();	// Bus.showMe()-inside the child class.
		
		// Warning:The following method should be accessed in a static way. 
		
		Bus12 bus = new Bus12();
		bus.showMe();	// Bus.showMe()-inside the child class. 
		bus.showInstanceMethod();	// Bus.showInstanceMethod()

		
		Empresa e = new Empresa();
		
		Calendar cg = Calendar.getInstance();
		
	}

}










