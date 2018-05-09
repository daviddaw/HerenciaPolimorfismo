package Hoja2.Sorteo;

public class Carta extends Sorteo {
	private final String[] palos= {"Oros","Copas","Espadas","Bastos"};
	private final String[] numeros= {"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Sota","Caballo","Rey"};
	int intPalo,intNumero;
	
	
	public Carta(int posibilidades) {
		super(posibilidades);
		
	}

	@Override
	public void lanzar() {
		//generamos palo
		intPalo=(int) (Math.random()*3+1);
		//generamos numero
		intNumero=(int) (Math.random()*11+1);
		System.out.println("Has Sacado el "+numeros[intNumero]+" de "+palos[intPalo]);
	}

}
