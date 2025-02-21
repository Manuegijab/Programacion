package Boletin3OO;

import java.time.LocalDate;

public class Persona {
private String dni;
private String nombre;
private String apellidos;
private LocalDate fechanacimiento;


public Persona(String dni, String nombre, String apellidos, LocalDate fechanacimiento) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.fechanacimiento = fechanacimiento;
	
}


public String getDni() {
	return dni;
}


public void setDni(String dni) {
	if(dni.matches("\\d{8}[A-Za-z]{1}")) {
		this.dni = dni;

	}
	else {
		System.out.println("ERROR: No es valido");
	}
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellidos() {
	return apellidos;
}


public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}


public LocalDate getFechanacimiento() {
	return fechanacimiento;
}


public void setFechanacimiento(LocalDate fechanacimiento) {
	this.fechanacimiento = fechanacimiento;
}


@Override
public String toString() {
	return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechanacimiento="
			+ fechanacimiento + "]";
}




}
