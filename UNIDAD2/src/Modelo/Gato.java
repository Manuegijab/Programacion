package Modelo;

import java.time.LocalDate;

public class Gato extends Mascotas {
	
	private String color;
	private boolean peloLargo;
	public Gato(String nombre, int edad, String estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
		this.color = color;
		this.peloLargo = peloLargo;
	}
	
	@Override
	public boolean habla() {
		return false;
	}
	@Override
	public String muestra() {
		return "Gato [color=" + color + ", peloLargo=" + peloLargo + "]";
	}

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected boolean isPeloLargo() {
		return peloLargo;
	}

	protected void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}
	
	
}
