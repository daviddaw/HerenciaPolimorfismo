package Hoja2.Figuras;

public abstract class Poligono extends Figura {
	
	
public Poligono(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}


private int numLados;

public int getNumLados() {
	return numLados;
}

public void setNumLados(int numLados) {
	this.numLados = numLados;
}



public void perimetro(int numLados) {
	this.numLados = numLados;
}

public abstract double area();

public abstract double perimetro();


@Override
public String toString() {
	return "Poligono [numLados=" + numLados + ", toString()=" + super.toString() + "]";
}


}
