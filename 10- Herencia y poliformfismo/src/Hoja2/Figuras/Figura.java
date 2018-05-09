package Hoja2.Figuras;

public abstract class Figura {
	
	private String color;
	
 public Figura(String color) {
		this.color = color;
	}



 
 
 

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public abstract double area();

public abstract double perimetro();


@Override
public String toString() {
	return "Figuras [color=" + color + "]";
}

}
