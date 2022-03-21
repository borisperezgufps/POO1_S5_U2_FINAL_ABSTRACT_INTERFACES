package ufps.poo2.demo6;

public class ParentClass {
	
	private static ParentClass instance;
	
	private ParentClass() {
	}
	
	public static ParentClass getInstance() {
		if(instance==null) {
			instance = new ParentClass();
			System.out.println("Clase instanciada");
		}
		return instance;
	}

	public void showMe() {
		System.out.println("Inside Parent.showMe()");
	}
}
