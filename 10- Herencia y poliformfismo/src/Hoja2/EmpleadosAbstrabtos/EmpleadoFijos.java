package Hoja2.EmpleadosAbstrabtos;

public class EmpleadoFijos extends Empleado{
	double salario;
	public EmpleadoFijos(String nombre, String dni, int telefono,double salario) {
		super(nombre, dni, telefono);
		this.salario=salario;
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double salario() {
		
		return salario;
	}

	@Override
	public String toString() {
		return "EmpleadoFijos [salario=" + salario + ", toString()=" + super.toString() + "]";
	}


}
