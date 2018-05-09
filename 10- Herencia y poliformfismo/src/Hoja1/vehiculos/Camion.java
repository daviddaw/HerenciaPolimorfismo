package Hoja1.vehiculos;

public class Camion extends Vehiculo {
	private int limiteCarga;
	private int carga;
	private String conductor;
	
	//Constructor
	Camion(String marca, String matricula, int numeroRuedas, double autonomia,int limiteCarga,int carga,String conductor) {
		super(marca, matricula, numeroRuedas, autonomia);
		this.limiteCarga=limiteCarga;
		this.cargaMaxima(carga, limiteCarga);
		this.conductor=conductor;
		
	}
	//metodo para solucionar el limite de carga
	public void  cargaMaxima (int carga,int limiteCarga) {
		
		if (carga > limiteCarga) {
			System.out.println("La carga maxima es " + limiteCarga);
		this.carga = limiteCarga;
		}
		else {
			System.out.println("La carga es "+carga+" menor que el limite que es "+limiteCarga);
			this.carga = carga;
		}
	}
	//cargar camion
	public void cargarCamion(int carga) {
		if (this.carga > limiteCarga) {
			System.out.println("La carga maxima es " + limiteCarga);
		this.carga = limiteCarga;
		}else {
			System.out.println("La carga es "+carga+" menor que el limite que es "+limiteCarga);
			this.carga += carga;
		}
		
	}
	public void descargarCamion(int cantidad) {
		//descargar: Dismimuye la carga en cierta cantidad. Si la cantidad es mayor que la carga, la carga se considerará 0.
		if (this.carga<cantidad) {
			this.carga=0;
		}else {
			this.carga=this.carga-cantidad;
		}
		
			}
	
	//get y set
	

	
	
	public double getLimiteCarga() {
		return limiteCarga;
	}
	public void setLimiteCarga(int limiteCarga) {
		this.limiteCarga = limiteCarga;
	}
	

	
	
	
	public double getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	

	
	public String getConductor() {
		return conductor;
	}
	public void cambiarConductor(String conductor) {
		this.conductor = conductor;
	}
	//toString
	@Override
	public String toString() {
		return "Camion [limiteCarga=" + limiteCarga + ", carga=" + carga + ", conductor=" + conductor + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

	
	
	


//Para los camiones los atributos son: marca, matrícula, número de ruedas (no tiene porqué ser 4), autonomía,
//límite de carga (entero), carga (entero), conductor (String). Si la carga excede del límite, se tomará como carga dicho límite.

}
