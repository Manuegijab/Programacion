package Modelo;

import java.time.LocalDate;

public abstract class Mascotas {
private String nombre;
private int edad;
private String estado;
private LocalDate fechaNacimiento;


public abstract String muestra();

public LocalDate cumpleaños() {
	return fechaNacimiento;
}
public boolean morir() {
	return true;
}
public abstract boolean habla();
}
