package poo2.abs_inter.demo2;

public class Demonstration2 {

	public static void main(String[] args) {
		System.out.println("***Demonstration-2.Abstract classes can have concrete "
				+ "methods and fields.***\n");

//		AbstractClass ac = new AbstractClass();
		
		ConcreteClass concreteOb = new ConcreteClass();
		concreteOb.showMe();

		// It will show that completeMethod1 is redefined in ConcreteClass.
		concreteOb.completeMethod1();

		// It will show the details of completeMethod2 defined in AbstractClass.
		concreteOb.completeMethod2();

		System.out.println("\n**Invoking methods through parent class reference now.**");
		
		AbstractClass abstractRef = new ConcreteClass();
		abstractRef.showMe();
		abstractRef.completeMethod1();
		abstractRef.completeMethod2();
	}
	
	// Importante 1: Una clase puede marcarse como Abstract y no tener metodos abstracts.
	// No tiene implicaciones más allá de que la clase no se podrá instanciar.
	
	// Importante 2: Una clase abstracta no tiene mucho sentido si no existe herencia.
	
	// Importante 3: La clase hija de una clase abstracta debe implementar todos sus métodos
	// abstractos, de lo contrario se tendrá que marcar como abstracta.

}
