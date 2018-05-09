package Hoja1.vehiculos;

public class Principal {

	public static void main(String[] args) {
		Vehiculo vehiculo1 = new Vehiculo("Renault","2254-pv",4, 1000.0);
		Coche coche1 = new Coche("Renault","2238-gmt",4,2000.0, 6, false, "Amarillo");
		System.out.println("alcrear el camion ntentamos cargar con 400 kilos el camion y a la vez ponemos el limite en 300");
		Camion camion1 = new Camion("Pegaso","2345-gfd",6,3000, 300, 400, "Pedro");
		
		
		Camion camion2 = new Camion("Mercedes","1111-aaa",8,4000, 150, 0,"Juan");
		
		//color original
		System.out.println(coche1);
		//Pintar
		coche1.pintar("Magenta");
		//Nuevo color
		System.out.println(coche1);
		
		//cargar
		System.out.println(camion1);

		System.out.println("Intentamos cargar 500 kilos pero la carga ya esta en el limite");
		camion1.cargarCamion(500);
		System.out.println(camion1);
		System.out.println("Intentamos cargar 50 kilos pero la carga ya esta en el limite");
		camion1.cargarCamion(50);
		System.out.println(camion1);
		System.out.println("Descargar 50");
		camion1.descargarCamion(50);
		System.out.println(camion1);
		System.out.println("Descargar 500");
		camion1.descargarCamion(500);
		System.out.println(camion1);
		vehiculo1.setMarca("Audi");
		camion2.cambiarConductor("Ramon");
		

		
		
	}

	/*Veh�culos

Teniendo en cuanta los siguientes requisitos dise�a y programa las clases adecuadamente. Tenemos una empresa que dispone de un parque m�vil de coches y camiones. 

Para los coches almacena los siguientes atributos: marca, matr�cula, n�mero de ruedas (siempre 4), autonom�a, color, n�mero de pasajeros y si es o no descapotable.

Para los camiones los atributos son: marca, matr�cula, n�mero de ruedas (no tiene porqu� ser 4), autonom�a, l�mite de carga (entero), carga (entero), conductor (String). Si la carga excede del l�mite, se tomar� como carga dicho l�mite.

Tener en cuenta que existir� una clase Veh�culo de la cual colgar�n las clases �Coches� y �Camiones� heredadas.

Dise�a los atributos, constructores y m�todos que consideres necesarios en la superclase y en las subclases 

Para manipular la informaci�n de los coches se utilizan dos m�todos:

pintar: cambia de color un coche.
listar: lista todos los atributos de un coche.

Para manipular la informaci�n de los camioneros se necesitan estos m�todos:
cambiarConductor: Modificar el nombre del conductor del cami�n
cargar: Incrementa la carga en cierta cantidad. La carga final no puede sobrepasar el l�mite, en cuyo caso se aplica lo mismo que en el construtor.
descargar: Dismimuye la carga en cierta cantidad. Si la cantidad es mayor que la carga, la carga se considerar� 0.
listar: Lista todos los datos de un cami�n.

Se pide crear una clase que contenga un main para crear 1 veh�culo, 1 coche y 2 camiones y probar los m�todos anteriores de pintar(), cargar() y descargar(), visualizando los objetos.

*/
}
