package Modelo;

import java.util.Objects;

public abstract class AEmpleado implements INomina {
String nombre;
String identificador;
String apellidos;
float salario;
boolean tieneReduccionHoraria;
Categoria categoria;


abstract String[] devuelvefunciones();

abstract void imprimeHorario();

public AEmpleado() {
	super();
	
}


public AEmpleado(String nombre, String identificador, String apellidos, float salario, boolean tieneReduccionHoraria,
		Categoria categoria) {
	super();
	this.nombre = nombre;
	this.identificador = identificador;
	this.apellidos = apellidos;
	this.salario = salario;
	this.tieneReduccionHoraria = tieneReduccionHoraria;
	this.categoria = categoria;
}
@Override
public String toString() {
	return "AEmpleado [nombre=" + nombre + ", identificador=" + identificador + ", apellidos=" + apellidos
			+ ", salario=" + salario + ", tieneReduccionHoraria=" + tieneReduccionHoraria + "]";
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AEmpleado other = (AEmpleado) obj;
	return Objects.equals(apellidos, other.apellidos) && Objects.equals(identificador, other.identificador)
			&& Objects.equals(nombre, other.nombre)
			&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario)
			&& tieneReduccionHoraria == other.tieneReduccionHoraria;
}


}
