package Hoja3.LlamadasTelefonicas;

public class Provincial extends Llamada{
private int	franja;

public Provincial(int numeroOrigen, int numeroDestino, int duracion, int franja) {
	super(numeroOrigen, numeroDestino, duracion);
	this.franja = franja;
}

public int getFranja() {
	return franja;
}

public void setFranja(int franja) {
	this.franja = franja;
}


@Override
public int costeLlamada() {
	int[] arrayFranjas = {20,25,30};//si lo inicio con el  corchete ya no lo inicion llaves por que da error
	int resultado =   (arrayFranjas[franja-1]*getDuracion());
	return resultado;
}

@Override
public String toString() {
	return "Provincial [franja=" + franja + ", costeLlamada()=" + costeLlamada() + ", toString()=" + super.toString()
			+ "]";
}














}
