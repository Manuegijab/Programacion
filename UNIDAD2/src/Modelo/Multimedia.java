package Modelo;

public abstract class Multimedia extends Recurso{

	private String nombre;
	private String genero;
	private int diasprestamos;
	
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getGenero() {
		return genero;
	}
	protected void setGenero(String genero) {
		this.genero = genero;
	}
	protected int getDiasprestamos() {
		return diasprestamos;
	}
	protected void setDiasprestamos(int diasprestamos) {
		this.diasprestamos = diasprestamos;
	}
	public Multimedia(String nombre, String genero, int diasprestamos) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.diasprestamos = 10;
	}
	
	@Override
	public int devuelvediasdisponible() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
