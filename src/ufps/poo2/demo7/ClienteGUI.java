package ufps.poo2.demo7;

public class ClienteGUI {

	public static void main(String[] args) {
		
		Empresa er = new Empresa();
		
		Empleado el1 = new Empleado();
		
		er.pagarBonificacion(el1);
		
		Docente d1 = new Docente();
		
		er.pagarBonificacion(d1);
		
	}
	
}
