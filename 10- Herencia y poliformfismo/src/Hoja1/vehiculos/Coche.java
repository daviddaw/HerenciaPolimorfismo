package Hoja1.vehiculos;

public class Coche extends Vehiculo{
	//ATR
	private int numeroPasajeros;
	private boolean descapotable;
	private String color;
	//CO
	Coche(String marca, String matricula, int numeroRuedas, double autonomia,int numeroPasajeros,boolean descapotable, String color) {
		super(marca, matricula, 4, autonomia);//preguntar
		this.numeroPasajeros=numeroPasajeros;
		this.descapotable=descapotable;
		this.color = color;
	}
	/*coches: marca, matrícula, número de ruedas (siempre 4), autonomía, color, número de pasajeros y si es o no descapotable.*/
	
	//Get y set
	
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public boolean isDescapotable() {
		return descapotable;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	
	public void pintar(String color) {
	 this.color=color;
	}
    
	
	
	//toString
	@Override
	public String toString() {
		return "Coche [numeroPasajeros=" + numeroPasajeros + ", descapotable=" + descapotable + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
