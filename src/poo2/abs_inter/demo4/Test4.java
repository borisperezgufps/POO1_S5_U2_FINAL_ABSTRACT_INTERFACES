package poo2.abs_inter.demo4;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("***Test4.Exploring Interfaces.***\n"); 
		// MyClass myClassOb = new MyClass(); // Error:MyClass is abstract now 
		// MyInterface myOb = new MyClass(); // Error:MyClass is abstract now 
		
		MyInterface myOb = new MySubClass();
		myOb.show1();
		myOb.show2();

	}

}
