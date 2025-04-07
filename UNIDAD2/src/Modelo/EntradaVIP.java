package Modelo;

import java.time.LocalDate;

public class EntradaVIP {

	private String codentrada;
	private LocalDate fechaentrada;
	private TipoEntrada tipoentrada;
	private EstadoEntrada estadoentrada;
	
	
	public EntradaVIP(String codentrada, LocalDate fechaentrada, TipoEntrada tipoentrada, EstadoEntrada estadoentrada) {
		super();
		this.codentrada = codentrada;
		this.fechaentrada = fechaentrada;
		this.tipoentrada = tipoentrada;
		this.estadoentrada = estadoentrada;
	}


	public String getCodentrada() {
		return codentrada;
	}


	public void setCodentrada(String codentrada) {
		this.codentrada = codentrada;
	}


	public LocalDate getFechaentrada() {
		return fechaentrada;
	}


	public void setFechaentrada(LocalDate fechaentrada) {
		this.fechaentrada = fechaentrada;
	}


	public TipoEntrada getTipoentrada() {
		return tipoentrada;
	}


	public void setTipoentrada(TipoEntrada tipoentrada) {
		this.tipoentrada = tipoentrada;
	}


	public EstadoEntrada getEstadoentrada() {
		return estadoentrada;
	}


	public void setEstadoentrada(EstadoEntrada estadoentrada) {
		this.estadoentrada = estadoentrada;
	}


	@Override
	public String toString() {
		return "EntradaVIP [codentrada=" + codentrada + ", fechaentrada=" + fechaentrada + ", tipoentrada="
				+ tipoentrada + ", estadoentrada=" + estadoentrada + "]";
	}
	
	
	
}
