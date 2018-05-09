package Hoja1.viviendas;

public class Palacio extends Vivienda {
	private boolean chofer;
	
	public Palacio(int numeroHabitaciones, double metrosCuadrados, String calle, int numero,boolean chofer) {
		super(10, metrosCuadrados, calle, numero);
		this.chofer=chofer;
	}

	public boolean isChofer() {
		return chofer;
	}

	public void setChofer(boolean chofer) {
		this.chofer = chofer;
	}

	

}
