package Hoja3.LlamadasTelefonicas;

public class Local extends Llamada {
	private int coste;
public Local(int numeroOrigen, int numeroDestino, int duracion, int coste) {
		super(numeroOrigen, numeroDestino, duracion);
		this.coste = coste;
	}






public int costeLlamada() {

	int resultado =this.coste*getDuracion();
	return resultado;
}

public int getCoste() {
	return coste;
}

public void setCoste(int coste) {
	this.coste = coste;
}






@Override
public String toString() {
	return "Local [coste=" + coste + ", costeLlamada()=" + costeLlamada() + ", toString()=" + super.toString() + "]";
}


















}
