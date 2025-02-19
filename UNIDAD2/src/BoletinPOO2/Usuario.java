package BoletinPOO2;

import java.util.Objects;

public class Usuario {
private String dni;
private String nombre;
private String nombredepartamento;
public Usuario(String dni, String nombre, String nombredepartamento) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.nombredepartamento = nombredepartamento;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Usuario other = (Usuario) obj;
	return Objects.equals(dni, other.dni);



}

protected String getDni() {
	return dni;
}

protected void setDni(String dni) {
	this.dni = dni;
}

protected String getNombre() {
	return nombre;
}

protected void setNombre(String nombre) {
	this.nombre = nombre;
}

protected String getNombredepartamento() {
	return nombredepartamento;
}

protected void setNombredepartamento(String nombredepartamento) {
	this.nombredepartamento = nombredepartamento;
}

@Override
public String toString() {
	return "Usuario [dni=" + dni + ", nombre=" + nombre + ", nombredepartamento=" + nombredepartamento + "]";
}


}