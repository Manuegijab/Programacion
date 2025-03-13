package Modelo;

public class Libro extends Recurso {

	
	
	@Override
	public boolean estaDisponible() {
		return false;
	}

	@Override
	public int devuelvediasdisponible() {
		return 0;
	}

}
