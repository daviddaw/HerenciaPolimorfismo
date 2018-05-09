package Hoja1.viviendas;

public class Chalet extends Vivienda{
	private double metrosJardin;
	private boolean piscina;

	public Chalet(int numeroHabitaciones, double metrosCuadrados, String calle, int numero,double metrosJardin, boolean piscina) {
		super(numeroHabitaciones, metrosCuadrados, calle, numero);
		this.metrosJardin=metrosJardin;
		this.piscina=piscina;
		
	}

	@Override
	public String toString() {
		return "Chalet [metrosJardin=" + metrosJardin + ", piscina=" + piscina + ", toString()=" + super.toString()
				+ "]";
	}
	
}
