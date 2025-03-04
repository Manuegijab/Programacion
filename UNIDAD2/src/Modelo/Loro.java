package Modelo;

public class Loro extends Aves {

	private String origen;
	private boolean habla;
	
	@Override
	public boolean volar() {
		return true;
	}

	@Override
	public String muestra() {
		return null;
	}

	@Override
	public boolean habla() {
		return habla;
	}

	public void saluda(){
		if (habla()) {
			System.out.println("Hola :v");
		}
	}
}
