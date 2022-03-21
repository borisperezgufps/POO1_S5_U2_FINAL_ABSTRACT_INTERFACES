package poo2.abs_inter.demo2;

public class ConcreteClass extends AbstractClass {
	
	@Override
	public void showMe() {
		System.out.println("ConcreteClass-showMe().I'm complete.");
		System.out.println("The value of myInt is:" + myInt);
	}

	@Override
	// It wants to override completeMethod1() in MyAbstractClass
	public void completeMethod1() {
		System.out.println("ConcreteClass-completeMethod1().");
	}

}
