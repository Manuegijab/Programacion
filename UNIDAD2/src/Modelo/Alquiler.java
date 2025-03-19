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
		
		int diasalquilados = fechainicio.getDayOfYear() - fechaentrega.getDayOfYear();
		float importe=0;
		float preciopordia=0;
		
		if ( this.datosvehiculo instanceof Furgoneta) {
			  importe= (float) (getpreciopordia() + ((Furgoneta) datosvehiculo).getPma() * 0.05);
		}
		
		else if ( datosvehiculo instanceof Coche) {
			importe= getpreciopordia()*diasalquilados;
		}
		else if ( this.datosvehiculo instanceof Patinete) {
			
			for(int i = 2; diasalquilados>i ; i++){
				
				importe= getpreciopordia()+ 30;
				
			}
		}
		return importe;
		
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
