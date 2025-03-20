package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Alquiler {

	int id ;
	VGeneral datosvehiculo;
	int permisocirculacion;
	String dni;
	
	LocalDate fechainicio;
	LocalDate fechaentrega;
	LocalDate fecharegistro;
	int numdias;
	Estado estado;

	
	public  float getpreciopordia() {
		
		int preciobase=0;
		float preciopordia=0;
		if ( this.datosvehiculo instanceof Furgoneta) {
			preciobase=45;
			preciopordia= (float) (preciobase + ((Furgoneta) datosvehiculo).getPma() * 0.05);
		}
		
		else if (this.datosvehiculo instanceof Coche) {
			preciobase=40;
			preciopordia= preciobase;
		}
		else if ( this.datosvehiculo instanceof Patinete) {
			preciobase=50;
			preciopordia= preciobase;
		}
		return preciopordia;
	}
	public  float getimportegenerado() {
		
		int diasalquilados = this.numdias;
		float importe=0;
		float preciopordia=0;
		
		if ( this.datosvehiculo instanceof Furgoneta) {
			  importe= (float) (getpreciopordia() + ((Furgoneta) datosvehiculo).getPma() * 0.05);
		}
		
		else if ( datosvehiculo instanceof Coche) {
			importe= getpreciopordia()*diasalquilados;
		}
		else if ( this.datosvehiculo instanceof Patinete) {
			
			importe= getpreciopordia()+30*(numdias-1);
				
			}
		
		return importe;
		
}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public VGeneral getDatosvehiculo() {
		return datosvehiculo;
	}
	public void setDatosvehiculo(VGeneral datosvehiculo) {
		this.datosvehiculo = datosvehiculo;
	}
	public int getPermisocirculacion() {
		return permisocirculacion;
	}
	public void setPermisocirculacion(int permisocirculacion) {
		this.permisocirculacion = permisocirculacion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}
	public LocalDate getFechaentrega() {
		return fechaentrega;
	}
	public void setFechaentrega(LocalDate fechaentrega) {
		this.fechaentrega = fechaentrega;
	}
	public LocalDate getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(LocalDate fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public int getNumdias() {
		return numdias;
	}
	public void setNumdias(int numdias) {
		this.numdias = numdias;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Objects.equals(fecharegistro, other.fecharegistro) && id == other.id;
	}
	
	
}
