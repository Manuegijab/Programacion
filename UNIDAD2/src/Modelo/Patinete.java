package Modelo;

public class Patinete extends VGeneral{

	
	int id;
	int tiempoautonomia;
	float cuantíadefianza;
	String marca;
	String modelo;
	boolean abonado;
	
	public boolean estaabonado() {
		return abonado;
	}
	
	@Override
	public boolean estaAlquilable() {
		if

		return false;
	}
	@Override
	public double getprecioDia() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
