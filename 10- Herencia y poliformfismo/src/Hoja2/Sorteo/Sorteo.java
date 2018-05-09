package Hoja2.Sorteo;

public abstract class Sorteo {
protected int posibilidades;
//Constructor
public Sorteo(int posibilidades) {
	this.posibilidades = posibilidades;
}
//Metodos
public abstract  void lanzar();

public  double probabilidad() {
	
	return (1/posibilidades);
	
}

public void verDatos() {
	
}
//Getters y Setters
public int getPosibilidades() {
	return posibilidades;
}

public void setPosibilidades(int posibilidades) {
	this.posibilidades = posibilidades;
}
//toString
	
}
