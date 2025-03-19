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
		
	}
	public  float getimportegenerado()
	
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
