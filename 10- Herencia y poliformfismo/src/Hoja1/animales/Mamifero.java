package Hoja1.animales;

//Atributos
public class Mamifero extends Animal {
	int numeroCrias,mesesEmbarazo;
	//Condtructor
public Mamifero(String nombreComun, String nombreEspecifico, int peso, int tamaño,int numeroCrias,int mesesEmbarazo) {
		super(nombreComun, nombreEspecifico, peso, tamaño);
		this.numeroCrias=numeroCrias;
		this.mesesEmbarazo=mesesEmbarazo;
		
	}
public int getNumeroCrias() {
	return numeroCrias;
}
public void setNumeroCrias(int numeroCrias) {
	this.numeroCrias = numeroCrias;
}
public int getMesesEmbarazo() {
	return mesesEmbarazo;
}
public void setMesesEmbarazo(int mesesEmbarazo) {
	this.mesesEmbarazo = mesesEmbarazo;
}
@Override
public String toString() {
	return "Mamifero ["+super.toString()+"numeroCrias=" + numeroCrias + ", mesesEmbarazo=" + mesesEmbarazo + "]";
}

}
