package Hoja2.Figuras;

public class Rectangulo extends Poligono implements Geometria {
	//Atributos
	private int base;
	private int altura;


//Constructor
	public Rectangulo(String color,int base,int altura) {
		super(color);
		this.base=base;
		this.altura=altura;
		
		
	}
	//metodos Heredados
	@Override
	public double area() {
		 int solucion = base*altura;
		return solucion;
	}

     public double calcularPerimetro() {
    	 return base*2+altura*2;
     }
	@Override
	public double perimetro() {
		int solucion=base*2+altura*2;
		return solucion;
	}
	//Get y Set
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	//toString
	@Override
	public String toString() {
		return "Soy una figura de color "+super.getColor()+" Además soy un polígono y un rectángulo con 4 lados: Mi área es " + area() + " y mi perímetro es " + perimetro();
		
	}
	
	


}
