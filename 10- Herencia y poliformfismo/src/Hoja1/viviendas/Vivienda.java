package Hoja1.viviendas;

public class Vivienda {
	//Atributos
	private int numeroHabitaciones;
	private double metrosCuadrados;
	private String calle;
	private int numero;
	//Constructor
	public Vivienda(int numeroHabitaciones, double metrosCuadrados, String calle, int numero) {
		this.numeroHabitaciones = numeroHabitaciones;
		this.metrosCuadrados = metrosCuadrados;
		this.calle = calle;
		this.numero = numero;
	}
	//getters y setters
	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}
	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Vivienda [numeroHabitaciones=" + numeroHabitaciones + ", metrosCuadrados=" + metrosCuadrados
				+ ", calle=" + calle + ", numero=" + numero + "]";
	}
	
	


	

	

}
