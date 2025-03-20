package Modelo;

public abstract class VGeneral implements IAlquilable{
	

	private int identificador;
	Alquiler[] alquiler;
	private boolean estaDisponible;
	
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public Alquiler[] getAlquiler() {
		return alquiler;
	}
	public void setAlquiler(Alquiler[] alquiler) {
		this.alquiler = alquiler;
	}
	public boolean isEstaDisponible() {
		return estaDisponible;
	}
	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	public float getimportetotalgenerdo() {
		float importetotal=0;
		for (Alquiler a : getAlquiler()) {
			if (a.getEstado())
		}
	}
	}
	
	

