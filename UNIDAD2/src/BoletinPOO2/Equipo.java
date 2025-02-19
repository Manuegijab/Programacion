package BoletinPOO2;

import java.util.Objects;

public class Equipo {
private String nombre;
private String direccionmac;
private String sistemaoperativo;
private int incidentes=0;


public Equipo(String nombre, String direccionmac, String sistemaoperativo) {
	super();
	this.nombre = nombre;
	this.direccionmac = direccionmac;
	this.sistemaoperativo = sistemaoperativo;
}


@Override
public String toString() {
	return nombre + "-" + direccionmac +":"+ incidentes;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getDireccionmac() {
	return direccionmac;
}


public void setDireccionmac(String direccionmac) {
	this.direccionmac = direccionmac;
}


public String getSistemaoperativo() {
	return sistemaoperativo;
}


public void setSistemaoperativo(String sistemaoperativo) {
	this.sistemaoperativo = sistemaoperativo;
}


public int getIncidentes() {
	return incidentes;
}


public void setIncidentes(int incidentes) {
	this.incidentes = incidentes;
}


@Override
public int hashCode() {
	return Objects.hash(direccionmac);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Equipo other = (Equipo) obj;
	return Objects.equals(direccionmac, other.direccionmac);
}


}
