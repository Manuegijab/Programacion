package Modelo;

import java.time.LocalDate;

public class Perro extends Mascotas {
	
	private String raza;
	private boolean pulgas;
	public Perro(String nombre, int edad, String estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
		this.raza = raza;
		this.pulgas = pulgas;
	}
	
	@Override
	public boolean habla() {
		
		return false;
	}
	@Override
	public String muestra() {
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
	}

	protected String getRaza() {
		return raza;
	}

	protected void setRaza(String raza) {
		this.raza = raza;
	}

	protected boolean isPulgas() {
		return pulgas;
	}

	protected void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}
	
	
}
