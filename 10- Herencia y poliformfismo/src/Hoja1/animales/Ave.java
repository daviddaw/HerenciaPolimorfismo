package Hoja1.animales;

//atributos
//El constructor vacio Animal() del padre, esta sin definir como constructor por defecto
//deberiamos definir un costructor explicito
public class Ave extends Animal{
int numeroHuevos;
boolean vuela;

//constructor
	//debemos invocar a otro contructor
public Ave(String nombreComun, String nombreEspecifico, int peso, int tamaño,int numeroHuevos,boolean vuela) {
	super(nombreComun, nombreEspecifico, peso, tamaño);
	this.numeroHuevos=numeroHuevos;
	this.vuela=vuela;

	}
//getters and setters      
public int getNumeroHuevos() {
	return numeroHuevos;
}

public void setNumeroHuevos(int numeroHuevos) {
	this.numeroHuevos = numeroHuevos;
}

public boolean isVuela() {
	return vuela;
}



public void setVuela(boolean vuela) {
	this.vuela = vuela;
}

{
	
}

@Override
public String toString() {
	return "Ave ["+super.toString()+"numeroHuevos=" + numeroHuevos + ", vuela=" + vuela + "]";
}


}