package Hoja1.viviendas;

public class TestViviendas {

	public static void main(String[] args) {
   
		Vivienda vivienda1 = new Vivienda(1, 10, "pajaro", 10);
		Chalet chalet1 = new Chalet(16, 900, "turina", 59, 500, true);
		Chalet chalet2 = new Chalet(8, 900, "ochoa", 40, 800, false);
		Palacio palacio1 = new Palacio(60, 10000, "luis", 333, true);
		
		Vivienda[] arrayviviendas = {vivienda1,chalet1,chalet2,palacio1};
		int contador=0;
	for (int i = 0; i < arrayviviendas.length; i++) {
		if (arrayviviendas[i]instanceof Chalet) {
			 contador = contador+1;
		}
		System.out.println(arrayviviendas[i].toString());
		System.out.println("Hay "+contador+" chalets");
	}	

	}

}
/*Dise�ar las siguientes clases:

Crea la clase Vivienda con los siguientes atributos: numero habitaciones, metros cuadrados, calle, n�mero. 
Crea la clase Chalet: Es una vivienda que, adem�s, tiene metros de jard�n  y puede tener o piscina. 
Crea la clase Palacio: Es una vivienda con 10 habitaciones y puede tener o no ch�fer. Las clases tendr�n los siguientes m�todos:
Constructores
M�todos get, set y toString.
Crea la clase TestViviendas  que contenga un m�todo main realice las siguientes operaciones:
Crear 1 vivienda, 2 chalets y 1 palacio.
Crear un array de 4 posiciones al que  se le asignar�n los objetos anteriores.
Recorrer el array y mostrar cada uno de los objetos por pantalla.
Recorrer el array y contar cu�ntos chalets hay imprimiendo el resultado.*/