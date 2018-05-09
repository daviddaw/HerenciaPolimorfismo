package Hoja1.animales;

//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		/*System.out.println("Nombre Especifico");
		String nombreEspecifico=in.next();
		System.out.println("Nombre comun");
		String nombreComun=in.next();
		System.out.println("Tamaño");
		int tamaño=in.nextInt();
		System.out.println("Peso");
		int peso=in.nextInt();
		Animal rana = new Animal(nombreComun,nombreEspecifico,peso,tamaño);
		System.out.println(rana.toString());*/
		
		
		//Creamos los objetos para no pedirlos cada vez por teclado
		Animal rana=new Animal("rana","comun",1,1);
		Mamifero ballena =new Mamifero("ballena", "ballenus", 10000, 5000, 4, 30);
		MamiferosTerrestres perro = new MamiferosTerrestres("perro","perrinus",34,100,6,7,4);
		Ave palomita = new Ave( "palomilla","palomus",3,1,1,true);
		Ave avestruz = new Ave("aveztruz","avenus",20,100,4,false);
		//Mostramos cada objeto
		System.out.println(rana.toString());
		System.out.println(ballena.toString());
		System.out.println(perro.toString());
		System.out.println(palomita.toString());
		System.out.println(avestruz.toString());
		//cambiamoselpeso de la rana
		rana.setPeso(200);
		//Cambiamos el peso de la ballena
		ballena.setPeso(21);
		//cambiamos el numero de huevos de la paloma
		palomita.setNumeroHuevos(3000);
		//cambiamos el tamaño del perro incrementadolo un 10%
		//perro.setTamaño((int) (perro.getTamaño()+(perro.getTamaño()*(0.1))) ); //10+100
		perro.setTamaño((int) (perro.getTamaño()*1.1));  //110
		
		//cambiamos los meses de embarazo de la ballena
		ballena.setMesesEmbarazo(9);
		//¿Se puede cambiar los meses de embarazo de la rana? Razona la respuesta.
		System.out.println("No tiene el atributo meses de embarazo la rana por que solo se lo hemos definido a los mamiferos y a las clases que heredan");
		//Visualiza de nuevo los objetos.

		System.out.println(" ");
		System.out.println(rana.toString());
		System.out.println(ballena.toString());
		System.out.println(perro.toString());
		System.out.println(palomita.toString());
		System.out.println(avestruz.toString());

	}

}
