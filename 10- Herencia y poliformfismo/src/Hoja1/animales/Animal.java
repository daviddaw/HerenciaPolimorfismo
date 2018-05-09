package Hoja1.animales;

public class Animal {
	//
	private String nombreComun;
	private String nombreEspecifico;
	private int peso;
	private int tamaño;
	
	//Constructores()
	public Animal(String nombreComun, String nombreEspecifico, int peso, int tamaño) {
		this.nombreComun = nombreComun;
		this.nombreEspecifico = nombreEspecifico;
		this.peso = peso;
		this.tamaño = tamaño;
	}
	//Getter() y setters()
	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}
	public String getNombreEspecifico() {
		return nombreEspecifico;
	}
	public void setNombreEspecifico(String nombreEspecifico) {
		this.nombreEspecifico = nombreEspecifico;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
//toString()
	@Override
	public String toString() {
		return "Animal [nombreComun=" + nombreComun + ", nombreEspecifico=" + nombreEspecifico + ", peso=" + peso
				+ ", tamaño=" + tamaño + "]";
	}
	
}
