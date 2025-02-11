package Herencia;

import java.time.LocalDate;

public class Profesorinterino extends Profesor {
private LocalDate fechafincontrato;



protected LocalDate getFechafincontrato() {
	return fechafincontrato;
}



protected void setFechafincontrato(LocalDate fechafincontrato) {
	this.fechafincontrato = fechafincontrato;
}



public Profesorinterino(String nombre, String nombredepartamento, LocalDate fechafincontrato) {
	super(nombre, nombredepartamento);
	this.fechafincontrato = fechafincontrato;
}






}
