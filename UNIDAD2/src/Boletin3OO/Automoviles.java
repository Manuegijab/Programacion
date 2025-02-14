package Boletin3OO;

public class Automoviles extends Vehiculo {
    private Calificacionecologica calificacinEcologica;
    
    public enum Calificacionecologica {
    	ECO,O,C,B
    	
    }
    
    public Automoviles(String dueno, int numpuertas, int numruedas, Calificacionecologica calificacinEcologica) {
		super(dueno, numpuertas, numruedas);
		this.calificacinEcologica = calificacinEcologica;
		
	}


	public Calificacionecologica getCalificacinEcologica() {
		return calificacinEcologica;
	}


	public void setCalificacinEcologica(Calificacionecologica calificacinEcologica) {
		if (calificacinEcologica.equals(calificacinEcologica.ECO) || calificacinEcologica.equals(calificacinEcologica.O) || calificacinEcologica.equals(calificacinEcologica.C) || calificacinEcologica.equals(calificacinEcologica.B) ){
			this.calificacinEcologica = calificacinEcologica;
		}
	}


	@Override
    public String toString() {
        return toString() + ", calificacinEcologica=" + calificacinEcologica + "]";
    }

    
    @Override
    public boolean tienelicenciaparacircular(String ciudad) {
      
        return false; 
    }
}