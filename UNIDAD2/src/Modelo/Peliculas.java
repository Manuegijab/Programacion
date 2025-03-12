package Modelo;

import java.util.Objects;

public class Peliculas extends Multimedia{

	
	public Peliculas(String nombre, String genero, int diasprestamos) {
		super(nombre, genero, diasprestamos);
		// TODO Auto-generated constructor stub
	}

	private int minutos;

	
	
	protected int getMinutos() {
		return minutos;
	}

	protected void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public boolean estaDisponible() {
		return false;
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(minutos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
		return false;
		Peliculas other = (Peliculas) obj;
		return minutos == other.minutos;
	}
	
	
	
}
