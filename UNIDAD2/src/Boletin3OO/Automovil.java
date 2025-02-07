package Boletin3OO;

public class Automovil {
private String dueno;
private int numpuertas;
private int numruedas;
private String calificacinEcologica;

public Automovil(String dueno, int numpuertas, int numruedas) {
	super();
	this.dueno = dueno;
	this.numpuertas = numpuertas;
	this.numruedas = numruedas;
	this.calificacinEcologica = calificacinEcologica;
}
@Override
public String toString() {
	return "Automovil [dueno=" + dueno + ", numpuertas=" + numpuertas + ", numruedas=" + numruedas
			+ ", calificacinEcologica=" + calificacinEcologica + "]";
}
public String getDueno() {
	return dueno;
}
public void setDueno(String dueno) {
	this.dueno = dueno;
}
public int getNumpuertas() {
	return numpuertas;
}
public void setNumpuertas(int numpuertas) {
	this.numpuertas = numpuertas;
}
public int getNumruedas() {
	return numruedas;
}
public void setNumruedas(int numruedas) {
	this.numruedas = numruedas;
}
public String getCalificacinEcologica() {
	return calificacinEcologica;
}
public void setCalificacinEcologica(String calificacinEcologica) {
	this.calificacinEcologica = calificacinEcologica;
}

public boolean tienelicenciaparacircular(String ciudad) {
	return
}
}
