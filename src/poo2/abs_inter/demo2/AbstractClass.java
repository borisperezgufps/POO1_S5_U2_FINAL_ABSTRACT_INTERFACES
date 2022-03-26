package poo2.abs_inter.demo2;

public abstract class AbstractClass {

	// the access modifier is protected, but you can use 
	// other types of modifiers also
	protected int myInt = 25;

	public abstract final void showMe();

	public void completeMethod1() {
		System.out.println("I am from completeMethod1 in MyAbstractClass "
				+ "and I am complete.");
	}

	public void completeMethod2() {
		System.out.println("I'm the initial version of completeMethod2() "
				+ "in MyAbstractClass.I am complete.");
	}

}
