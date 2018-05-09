package Hoja2.EmpleadosAbstrabtos;

public abstract class Empleado {
	//Atributos
private String nombre;
private String dni;
private int telefono;
//Constructor
public Empleado(String nombre, String dni, int telefono) {//omitimos el void,tipoo class
	this.nombre = nombre;
	this.dni = dni;
	this.telefono = telefono;
}

//getters y setters
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}
public abstract double salario();



//toString
@Override
public String toString() {
	return "Empleado [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
}





}
