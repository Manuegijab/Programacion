package Modelo;

public class Loro extends Aves {

	private String origen;
	private boolean habla;
	
	
	
	
	public Loro(String origen, boolean habla) {
		super();
		this.origen = origen;
		this.habla = habla;
	}



	protected String getOrigen() {
		return origen;
	}



	protected void setOrigen(String origen) {
		this.origen = origen;
	}



	protected boolean isHabla() {
		return habla;
	}



	protected void setHabla(boolean habla) {
		this.habla = habla;
	}



	@Override
	public boolean volar() {
		return true;
	}

	

	@Override
	public String muestra() {
		return "Loro [origen=" + origen + ", habla=" + habla + "]";
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
