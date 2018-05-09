package Hoja2.Sorteo;

public class Moneda extends Sorteo {
	double numero;
	String moneda;
	public Moneda(int posibilidades) {
		super(posibilidades);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lanzar() {
		numero = Math.random()*2+1;
		if(numero==0) {
			moneda="Cara";
		}else {
			moneda="Cruz";
		}
		System.out.println("La moneda ha salido "+moneda);
	}

}
