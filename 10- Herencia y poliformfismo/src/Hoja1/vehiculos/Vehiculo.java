package Hoja1.vehiculos;

public class Vehiculo {
	//Atributos
	private String marca;
	private String matricula;
	private int numeroRuedas;
	private double autonomia;
	
	
	//Constructor
	Vehiculo(String marca, String matricula, int numeroRuedas, double autonomia) {
		this.marca = marca;
		this.matricula = matricula;
		this.numeroRuedas = numeroRuedas;
		this.autonomia = autonomia;
		
	}

	//GET y SET
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}




	
	//toString
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", matricula=" + matricula + ", numeroRuedas=" + numeroRuedas
				+ ", autonomia=" + autonomia +  "]";
	}
	
	
	
	



}
/*marca, matrícula, número de ruedas (siempre 4), autonomía, color, número de pasajeros y si es o no descapotable.*/