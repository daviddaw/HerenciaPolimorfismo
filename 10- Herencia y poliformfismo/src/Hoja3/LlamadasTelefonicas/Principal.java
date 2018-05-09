package Hoja3.LlamadasTelefonicas;

public class Principal {

	public static void main(String[] args) {
		Llamada[] centralita = new Llamada[5];
		int acumulador = 0;
		int contadorLocal = 0;
		int contadorProvincial = 0;
//He creado los atributos con int para tardar menos
		
		centralita[0]=new Local(00000, 11111, 10, 15);
		centralita[1]=new Provincial(11111, 22222, 10, 1);
		centralita[2]=new Local(22222, 3333333, 10, 15);
		centralita[3]=new Provincial(333333, 444444, 10, 2);
		centralita[4]=new Provincial(44444, 5555555, 10, 3);
		
		for (int i = 0; i < centralita.length; i++) {
			System.out.println(centralita[i].toString());
			//System.out.println("coste "+centralita[i].costeLlamada());
			acumulador+=centralita[i].costeLlamada();
			
			if (centralita[i]instanceof Local) {
				
				contadorLocal++;
			}
			if (centralita[i]instanceof Provincial) {
				
				contadorProvincial++;
			}
				
			}
				
	
		System.out.println(" ");
		System.out.println("El coste total de todas las llamadas es "+acumulador+" euros, hay "+contadorLocal+" llamadas locales y "+contadorProvincial+" llamadas provinciales");
	}

}
