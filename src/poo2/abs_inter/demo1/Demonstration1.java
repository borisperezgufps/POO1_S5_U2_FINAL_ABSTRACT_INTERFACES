package poo2.abs_inter.demo1;

public class Demonstration1 {

	public static void main(String Args[]) {
		System.out.println("***Demonstration-1.Abstract class example.***\n");
		
		// Error:Cannot instantiate from MyAbstractClass
		// MyAbstractClass abstractOb=new MyAbstractClass();
		
		MyConcreteClass concreteOb = new MyConcreteClass(); 
		concreteOb.showMe();
		concreteOb.calcular();
		
		/*
		  	MyConcreteClass.showMe()
			I am supplying the method body for showMe()
			Calcular

		 */
		
		
		// MyAbstractClass concreteOb_ = new MyConcreteClass(); // Esto se puede hacer?
	}
	
	// Importante: Es importante señalar que una clase abstracta 
	// también puede contener métodos concretos. La clase derivada 
	// puede o no anular esos métodos.

}
