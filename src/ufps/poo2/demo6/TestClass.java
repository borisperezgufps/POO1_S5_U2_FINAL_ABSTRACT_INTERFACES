package ufps.poo2.demo6;

public class TestClass {

	public static void main(String[] args) {
//		ParentClass pc = new ParentClass();
		
		ParentClass pc_ = ParentClass.getInstance();
		pc_.showMe();
		
		ParentClass pc2 = ParentClass.getInstance();
		pc2.showMe();
	}
	
	/*
	 	Clase instanciada
		Inside Parent.showMe()
		Inside Parent.showMe()
	 */
	
}
