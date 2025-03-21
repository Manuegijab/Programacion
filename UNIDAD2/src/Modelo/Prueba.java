package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Prueba {
String id;
String lugar;
LocalDate fecha;
EstadoPrueba estado;


public Prueba(String id, String lugar, LocalDate fecha, EstadoPrueba estado) {
	super();
	this.id = id;
	this.lugar = lugar;
	this.fecha = fecha;
	this.estado = estado;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getLugar() {
	return lugar;
}
public void setLugar(String lugar) {
	this.lugar = lugar;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public EstadoPrueba getEstado() {
	return estado;
}
public void setEstado(EstadoPrueba estado) {
	this.estado = estado;
}

@Override
public String toString() {
	return "Prueba [id=" + id + ", lugar=" + lugar + ", fecha=" + fecha + ", estado=" + estado + "]";
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Prueba other = (Prueba) obj;
	return Objects.equals(id, other.id);
}

}
