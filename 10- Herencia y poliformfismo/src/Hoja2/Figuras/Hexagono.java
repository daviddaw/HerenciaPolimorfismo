package Hoja2.Figuras;

public class Hexagono extends Poligono{
	private int lado;
	private int apotema;

	public Hexagono(String color,int lado, int apotema) {
		super(color);
		this.apotema=apotema;
		this.lado=lado;
		// TODO Auto-generated constructor stub
	}
	//Get y Set
	


	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getApotema() {
		return apotema;
	}

	public void setApotema(int apotema) {
		this.apotema = apotema;
	}


	
  
@Override
public double perimetro() {
	double solucion = lado*6;
	return solucion;
}
@Override
public double area() {
	double solucion = (perimetro()*apotema)/(2);
	return solucion;
}
//toString
	@Override
	public String toString() {
		return "Soy una figura de color "+super.getColor()+" Además soy un hexagono con un apotema de "+apotema+"   : Mi área es " + area() + " y mi perímetro es " + perimetro();
	}
	

}
