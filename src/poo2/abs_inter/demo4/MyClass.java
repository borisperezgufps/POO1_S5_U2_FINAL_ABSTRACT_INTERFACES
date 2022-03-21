package poo2.abs_inter.demo4;

// MyClass becomes abstract. It has not implemented show2() of MyInterface
// class MyClass implements MyInterface //error
public abstract class MyClass implements MyInterface {

	private final int MYVAR = 34;
	
	@Override
	public void show1() {
		System.out.println("MyClass is implementing the interface method show1().");
	}
	// public abstract void show2();

}
