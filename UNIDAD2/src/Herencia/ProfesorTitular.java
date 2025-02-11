package Herencia;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {
private LocalDate fechaAdjudicacionPlaza;

protected LocalDate getFechaAdjudicacionPlaza() {
	return fechaAdjudicacionPlaza;
}

protected void setFechaAdjudicacionPlaza(LocalDate fechaAdjudicacionPlaza) {
	this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
}

public ProfesorTitular(String nombre, String nombredepartamento, LocalDate fechaAdjudicacionPlaza) {
	super(nombre, nombredepartamento);
	this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
}

@Override
public String toString() {
	return "ProfesorTitular [fechaAdjudicacionPlaza=" + fechaAdjudicacionPlaza + ", getNombredepartamento()="
			+ getNombredepartamento() + ", getNombre()=" + getNombre() + "]";
}


}
