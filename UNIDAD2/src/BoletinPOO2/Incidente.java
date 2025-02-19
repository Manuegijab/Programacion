package BoletinPOO2;

import java.time.LocalDate;
import java.util.Objects;

public class Incidente {
private int id;
private String nombre;
private String descripcion;
private LocalDate fecharegistro;
private LocalDate fechacerrada;
private Estado estado;
private Criticidad criticidad;
private Equipo equipo;

public Incidente(int id, String nombre, String descripcion, LocalDate fecharegistro, LocalDate fechacerrada,
		Estado estado, Criticidad criticidad) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.fecharegistro = fecharegistro;
	this.fechacerrada = fechacerrada;
	this.estado = estado;
	this.criticidad = criticidad;
}
protected boolean esurgente() {
	return criticidad.equals(criticidad.CRITICA)|| criticidad.equals(criticidad.GRAVE) && fecharegistro.isBefore(LocalDate.now().minusDays(7)) || criticidad.equals(criticidad.MEDIA) && fecharegistro.isBefore(LocalDate.now().minusDays(30)); 
}

@Override
public String toString() {
	return nombre + "-" + estado + ":" + criticidad+"-"+fecharegistro+"-"+ equipo.getNombre();
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getDescripcion() {
	return descripcion;
}


public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}


public LocalDate getFecharegistro() {
	return fecharegistro;
}


public void setFecharegistro(LocalDate fecharegistro) {
	this.fecharegistro = fecharegistro;
}


public LocalDate getFechacerrada() {
	return fechacerrada;
}


public void setFechacerrada(LocalDate fechacerrada) {
	if(estado.equals(estado.CERRADA)) {
		fechacerrada=null;
	}
	else {
	this.fechacerrada = fechacerrada;
	}
}


public Estado getEstado() {
	return estado;
}


public void setEstado(Estado estado) {
	if(estado.equals(estado.CERRADA)) {
		LocalDate fechacerro= LocalDate.now();
	}
	this.estado = estado;
}


public Criticidad getCriticidad() {
	return criticidad;
}


public void setCriticidad(Criticidad criticidad) {
	this.criticidad = criticidad;
}


public Equipo getEquipo() {
	return equipo;
}


public void setEquipo(Equipo equipo) {
	this.equipo = equipo;
}




@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Incidente other = (Incidente) obj;
	return criticidad == other.criticidad && Objects.equals(descripcion, other.descripcion)
			&& Objects.equals(equipo, other.equipo) && estado == other.estado
			&& Objects.equals(fechacerrada, other.fechacerrada) && Objects.equals(fecharegistro, other.fecharegistro)
			&& id == other.id && Objects.equals(nombre, other.nombre);
}



}
