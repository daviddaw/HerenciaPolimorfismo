package Hoja1.animales;

public class Animal {
	//
	private String nombreComun;
	private String nombreEspecifico;
	private int peso;
	private int tama�o;
	
	//Constructores()
	public Animal(String nombreComun, String nombreEspecifico, int peso, int tama�o) {
		this.nombreComun = nombreComun;
		this.nombreEspecifico = nombreEspecifico;
		this.peso = peso;
		this.tama�o = tama�o;
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
	public int getTama�o() {
		return tama�o;
	}
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
//toString()
	@Override
	public String toString() {
		return "Animal [nombreComun=" + nombreComun + ", nombreEspecifico=" + nombreEspecifico + ", peso=" + peso
				+ ", tama�o=" + tama�o + "]";
	}
	
}
