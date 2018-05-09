package Hoja2.Figuras;

public class Circulo extends Figura {
	//artibutos
	private double radio;

	//Constructor
	public Circulo(String color,double radio) {
		super(color);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}

//Metodos GetySet
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
//Metodos no abstractos
	
	
//Metodos Abstractos
	
	
	@Override
	public double area() {
		double solucion =Math.PI*(Math.pow(radio, 2));
		return solucion;
	}

	@Override
	public double perimetro() {
		double perimetro= Math.PI*(radio*2);
		return perimetro;
	}

	@Override
	public String toString() {
		return "Soy una figura de color "+super.getColor()+" Además soy un circulo con un radio de "+ radio+" : Mi área es " + area() + " y mi perímetro es " + perimetro();
	}

	
}
