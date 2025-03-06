package Modelo;

public class Canario extends Aves {

	private String color;
	private boolean canta;
	
	
	
	
	public Canario(String color, boolean canta) {
		super();
		this.color = color;
		this.canta = canta;
	}


	protected String getColor() {
		return color;
	}


	protected void setColor(String color) {
		this.color = color;
	}


	protected boolean isCanta() {
		return canta;
	}


	protected void setCanta(boolean canta) {
		this.canta = canta;
	}


	@Override
	public boolean volar() {
		return false;
	}

	
	@Override
	public String muestra() {
		return "Canario [color=" + color + ", canta=" + canta + "]";
	}

	@Override
	public boolean habla() {
		return false;
	}

}
