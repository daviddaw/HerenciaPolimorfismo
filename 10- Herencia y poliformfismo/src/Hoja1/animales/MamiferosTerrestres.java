package Hoja1.animales;

public class MamiferosTerrestres extends Mamifero{
	private int numeroPatas;
	
	      //Constructor
		public MamiferosTerrestres(String nombreComun, String nombreEspecifico, int peso, int tamaño, int numeroCrias,
			int mesesEmbarazo,int numeroPatas) {
		super(nombreComun, nombreEspecifico, peso, tamaño, numeroCrias, mesesEmbarazo);
		this.numeroPatas=numeroPatas;
	}
		
		   //Getters y Setters
				
		public int getNumeroPatas() {
			return numeroPatas;
		}

		public void setNumeroPatas(int numeroPatas) {
			this.numeroPatas = numeroPatas;
		}

		
		//toString
		@Override
		public String toString() {
			return "MamiferosTerrestres ["+super.toString()+"numeroPatas=" + numeroPatas + "]";
		}

		
		  
		
		
		
		

	

}
