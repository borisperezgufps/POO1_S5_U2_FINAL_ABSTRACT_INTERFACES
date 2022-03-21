package ufps.poo2.demo12;

public class Bus12 extends Vehicle12 {

	public static void showMe() { // hides Vehicle.showMe()
		System.out.println("Bus.showMe()-inside the child class.");
	}

	public void showInstanceMethod() {// overrides
		System.out.println("Bus.showInstanceMethod()");

	}

}
