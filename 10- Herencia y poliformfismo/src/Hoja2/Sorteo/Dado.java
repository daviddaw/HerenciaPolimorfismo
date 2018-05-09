package Hoja2.Sorteo;

public class Dado extends Sorteo{
	double numero;
//cons
	public Dado(int posibilidades) {
		super(posibilidades);
		// TODO Auto-generated constructor stub
	}

@Override
public void lanzar() {
	numero = Math.random()*6+1;
	System.out.println("Ha salido el numero "+(int) numero+" en el dado");
}



	
}
