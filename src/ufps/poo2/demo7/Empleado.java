package ufps.poo2.demo7;

public class Empleado {

	private int salario;
	
	final public void setCalcularBonificacion(int valorBonificado) {
		this.salario += salario + valorBonificado;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	
}
