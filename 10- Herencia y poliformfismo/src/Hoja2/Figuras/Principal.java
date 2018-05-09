package Hoja2.Figuras;
/*
 * 	Instanciar y probar objetos de cada clase. 
	Crear un array de figuras del tamaño que desees y guarda en él las figuras creadas.
	Recorrer el array mostrando los datos de cada figura.
	Contar cuántos polígonos y cuántos rectángulos se han creado.
*/
public class Principal {
	public static void main(String[] args) {
		int contadorPoligonos = 0;
		int contadorRectangulos = 0;
		Figura[] arrayFiguras = new Figura[3];
		
		arrayFiguras[0] = new Circulo("Amarillo",5.5);
		arrayFiguras[1] = new Rectangulo("Rojo",5,7);
		arrayFiguras[2] = new Hexagono("naranja", 5, 10);
		
		
		for (int i = 0; i < arrayFiguras.length; i++) {
			System.out.println(arrayFiguras[i].toString());
			
			if (arrayFiguras[i]instanceof Poligono) {
				contadorPoligonos++;
			}
			if (arrayFiguras[i]instanceof Rectangulo) {
				contadorRectangulos++;
			}
		}
		
		System.out.println("Hay "+contadorPoligonos+" poligonos y "+contadorRectangulos+" rectangulos");
		
	}

	
	
	
	

	
	
	
}
