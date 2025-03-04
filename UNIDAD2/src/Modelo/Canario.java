package Modelo;

public class Canario extends Aves {

	private String color;
	private boolean canta;
	@Override
	public boolean volar() {
		return false;
	}

	@Override
	public String muestra() {
		return null;
	}

	@Override
	public boolean habla() {
		return false;
	}

}
