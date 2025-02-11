package Herencia;

public class Profesor extends Persona {
	
private String nombredepartamento;



protected String getNombredepartamento() {
	return nombredepartamento;
}



protected void setNombredepartamento(String nombredepartamento) {
	this.nombredepartamento = nombredepartamento;
}



public Profesor(String nombre, String nombredepartamento) {
	super(nombre);
	this.nombredepartamento = nombredepartamento;
}




}
