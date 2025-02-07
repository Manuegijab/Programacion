package Boletin3OO;

public class Camion {
	private String dueno;
	private int numpuertas;
	private int numruedas;
	private int tonelajekilos;
	private int numpasajeros;
	private int numejes;
	public Camion(String dueno, int numpuertas, int numruedas, int tonelajekilos, int numpasajeros, int numejes) {
		super();
		this.dueno = dueno;
		this.numpuertas = numpuertas;
		this.numruedas = numruedas;
		this.tonelajekilos = tonelajekilos;
		this.numpasajeros = numpasajeros;
		this.numejes = numejes;
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
	public int getTonelajekilos() {
		return tonelajekilos;
	}
	public void setTonelajekilos(int tonelajekilos) {
		this.tonelajekilos = tonelajekilos;
	}
	public int getNumpasajeros() {
		return numpasajeros;
	}
	public void setNumpasajeros(int numpasajeros) {
		this.numpasajeros = numpasajeros;
	}
	public int getNumejes() {
		return numejes;
	}
	public void setNumejes(int numejes) {
		this.numejes = numejes;
	}
	@Override
	public String toString() {
		return "Camion [dueno=" + dueno + ", numpuertas=" + numpuertas + ", numruedas=" + numruedas + ", tonelajekilos="
				+ tonelajekilos + ", numpasajeros=" + numpasajeros + ", numejes=" + numejes + "]";
	}
	
	
}
