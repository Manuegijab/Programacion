package FutureCars;

import java.util.Objects;

public class Conductor {
private String nombre;
private int año;
public Conductor(String nombre, int año) {
	super();
	this.nombre = nombre;
	setAño(año);
	this.año = getAño();
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getAño() {
	return año;
}
public void setAño(int año) {
	if (año>0) {
	this.año = año;
}
	else{
		this.año=0;}
	}
@Override
public String toString() {
	return "Conductor [nombre=" + nombre + ", año=" + año + "]";
}
@Override
public int hashCode() {
	return Objects.hash(año, nombre);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Conductor other = (Conductor) obj;
	return año == other.año && Objects.equals(nombre, other.nombre);
}


}
