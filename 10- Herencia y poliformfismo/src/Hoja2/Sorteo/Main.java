package Hoja2.Sorteo;

public class Main {

	public static void main(String[] args) {
		Carta carta1 = new Carta(5);
		carta1.lanzar();
		Dado dado1 = new Dado(6);
		dado1.lanzar();
		Moneda moneda1 = new Moneda(7);
		moneda1.lanzar();

	}

}
