package Hoja2.EmpleadosAbstrabtos;

public class EmpleadoHoras extends Empleado {
	private int numeroHoras;
	private final double eurosHora=15;
   //no queremos news en la declaracion de atributos ni de tipo
	public EmpleadoHoras(String nombre, String dni, int telefono,int numeroHoras) {
		super(nombre, dni, telefono);
		this.numeroHoras=numeroHoras;
	    
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public double getEurosHora() {
		return eurosHora;
	}



	@Override
	public double salario() {
	double salario = numeroHoras*eurosHora;
		return salario;
	}

	@Override
	public String toString() {
		return "EmpleadoHoras [numeroHoras=" + numeroHoras + ", eurosHora=" + eurosHora + ", toString()="
				+ super.toString() + "]";
	}

}
