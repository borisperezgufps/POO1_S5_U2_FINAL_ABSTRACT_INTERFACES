package ufps.poo2.demo7;

public class Docente extends Empleado {

	@Override
	public void setCalcularBonificacion(int valorBonificado) {
		setSalario(getSalario()+valorBonificado+1000000);
	}
	
}
