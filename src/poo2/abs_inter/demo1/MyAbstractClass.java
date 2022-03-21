package poo2.abs_inter.demo1;

public abstract class MyAbstractClass {

	public abstract void showMe(); 
	
	public void calcular() {
		System.out.println("Calcular");
	}

}

/*
 * 
 public class MyAbstractClass {

	public abstract void showMe(); // Si se deja así, se marcará error: The abstract method showMe in type MyAbstractClass can only be defined by an abstract class

}
*/
