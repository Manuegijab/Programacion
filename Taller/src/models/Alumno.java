package models;

import java.util.Objects;

public class Alumno {
private String nombre;
private int edad;
private String numtelefono;
public Alumno(String nombre, int edad, String numtelefono) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.numtelefono = numtelefono;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getNumtelefono() {
	return numtelefono;
}
public void setNumtelefono(String numtelefono) {
	this.numtelefono = numtelefono;
}
@Override
public int hashCode() {
	return Objects.hash(nombre);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Alumno other = (Alumno) obj;
	return Objects.equals(nombre, other.nombre);
}


}
