package Modelo;

import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo> {

	private String bastidor;
	private String matricula;
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private String proActual;

	public Vehiculo(String bastidor, String matricula, String marca, String modelo, int anioFabricacion,
			String proActual) {
		super();
		this.bastidor = bastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.proActual = proActual;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getProActual() {
		return proActual;
	}

	public void setProActual(String proActual) {
		this.proActual = proActual;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bastidor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(bastidor, other.bastidor);
	}

	@Override
	public String toString() {
		return "Vehiculo [bastidor=" + bastidor + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", anioFabricacion=" + anioFabricacion + "]";
	}

	@Override
	public int compareTo(Vehiculo otroCoche) {
		int resultadoComparar = this.bastidor.compareTo(otroCoche.getBastidor());
		
		return resultadoComparar;
	}
	
	
	
}
