package Modelo;

public class Furgoneta extends VehiculoCombustible {

private int plazas;
private int pma;
	@Override
	public boolean estaAlquilable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getprecioDia() {
		// TODO Auto-generated method stub
		return 0;
		
		
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public int getPma() {
		return pma;
	}

	public void setPma(int pma) {
		this.pma = pma;
	}

}
