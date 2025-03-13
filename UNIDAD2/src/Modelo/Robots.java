package Modelo;

import java.util.Objects;

public abstract class Robots {

private int id;
private String modelo;
private int bateria;
private Estado estado;
private float combustible;
private String descripcion;
private static int contador;


public Robots() {
	super();
	this.id = contador +1;
	contador= contador +1;
	this.modelo = modelo;
	this.bateria = bateria;
	this.estado = estado;
	this.combustible = combustible;
	this.descripcion = descripcion;
	
	
}
protected String getModelo() {
	return modelo;
}
protected void setModelo(String modelo) {
	this.modelo = modelo;
}
protected int getBateria() {
	return bateria;
}
protected void setBateria(int bateria) {
	if(bateria>10) {
	this.bateria = bateria;
	}
	else {
		System.out.println("ERROR: Bateria debe ser mayor de 10");
	}
}
protected Estado getEstado() {
	return estado;
}
protected void setEstado(Estado estado) {
	this.estado = estado;
}
protected float getCombustible() {
	return combustible;
}
protected void setCombustible(float combustible) {
	this.combustible = combustible;
}
protected String getDescripcion() {
	return descripcion;
}
protected void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Robots other = (Robots) obj;
	return id == other.id;
}

public abstract String ejecutartarea();
public abstract boolean recargar();

}
