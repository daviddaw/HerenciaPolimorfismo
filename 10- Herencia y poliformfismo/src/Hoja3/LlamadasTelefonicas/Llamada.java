package Hoja3.LlamadasTelefonicas;

public abstract class Llamada {
private int numeroOrigen;
private int numeroDestino;
private int duracion;

public Llamada(int numeroOrigen, int numeroDestino, int duracion) {
	this.numeroOrigen = numeroOrigen;
	this.numeroDestino = numeroDestino;
	this.duracion = duracion;
}

public int getNumeroOrigen() {
	return numeroOrigen;
}

public void setNumeroOrigen(int numeroOrigen) {
	this.numeroOrigen = numeroOrigen;
}

public int getNumeroDestino() {
	return numeroDestino;
}

public void setNumeroDestino(int numeroDestino) {
	this.numeroDestino = numeroDestino;
}

public int getDuracion() {
	return duracion;
}

public void setDuracion(int duracion) {
	this.duracion = duracion;
}

public abstract int costeLlamada();

@Override
public String toString() {
	return "Llamada [numeroOrigen=" + numeroOrigen + ", numeroDestino=" + numeroDestino + ", duracion=" + duracion
			+ "]";
}





}
