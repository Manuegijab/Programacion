package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascotas {
private String nombre;
private int edad;
private String estado;
private LocalDate fechaNacimiento;




@Override
public int hashCode() {
	return Objects.hash(edad, estado, fechaNacimiento, nombre);
}

@Override
public boolean equals(Object obj) {
	this.getClass().getName();
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Mascotas other = (Mascotas) obj;
	return edad == other.edad && Objects.equals(estado, other.estado)
			&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(nombre, other.nombre);
}

public abstract String muestra();

public LocalDate cumpleaños() {
	return fechaNacimiento;
}
public boolean morir() {
	return true;
}
public abstract boolean habla();
}
