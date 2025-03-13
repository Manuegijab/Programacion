package Modelo;

public class Emplead implements Accion{

	@Override
	public String ejecutaaccion() {
		return"Trabajador trabaja";
 
		
	}

	@Override
	public String toString() {
		return ejecutaaccion();
	}

}
