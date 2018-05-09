package Hoja2.EmpleadosAbstrabtos;

public class PrincipalEmpleados {

	public static void main(String[] args) {
		
		Empleado[] arrayEmpleados = new Empleado[3];
		 arrayEmpleados[0] = new EmpleadoFijos("David","048484583-E",658843432, 3000);
		 arrayEmpleados[1] = new EmpleadoHoras("Alex","048484583-E",658843432,100);
		 arrayEmpleados[2] = new EmpleadoHoras("Pedro","048484583-E",658843432,200);
		 
		 for (int i = 0; i < arrayEmpleados.length; i++) {
			System.out.println(arrayEmpleados[i].toString());
			System.gc();
			System.out.println(arrayEmpleados[i].salario());
		}
		
		

	}

}
