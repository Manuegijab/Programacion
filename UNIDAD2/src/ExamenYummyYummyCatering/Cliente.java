package ExamenYummyYummyCatering;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
private String dni;
private String nombre;
private String apellidos;
private int edad;
private Menu dietaasignada;
private LocalDate fechainscripcion;
private boolean vip;
public Cliente(String dni, String nombre, String apellidos, int edad, Menu dietaasignada, LocalDate fechainscripcion,
		boolean vip) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	setEdad( edad);
	this.edad = edad;
	this.dietaasignada = dietaasignada;
	this.fechainscripcion = fechainscripcion;
	this.vip = vip;
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
protected String getApellidos() {
	return apellidos;
}
protected void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
protected int getEdad() {
	return edad;
}
protected void setEdad(int edad) {
	if (edad<0) {
		System.out.println("ERROR: EDAD MENOR A 0");
	}
	else {
	this.edad = edad;
	}
}
protected Menu getDietaasignada() {
	return dietaasignada;
}
protected void setDietaasignada(Menu dietaasignada) {
	this.dietaasignada = dietaasignada;
}
protected LocalDate getFechainscripcion() {
	return fechainscripcion;
}
protected void setFechainscripcion(LocalDate fechainscripcion) {
	this.fechainscripcion = fechainscripcion;
}
protected boolean isVip() {
	return vip;
}
protected void setVip(boolean vip) {
	this.vip = vip;
}
@Override
public int hashCode() {
	return Objects.hash(dni);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cliente other = (Cliente) obj;
	return Objects.equals(dni, other.dni);
}
public boolean hayquehacerpromocion() {
	return vip==true || edad>65; 
	
	}
public double calculapreciopromocion() {
	double precioconpromocion= 0;
	if(hayquehacerpromocion()) {
		if(this.dietaasignada.getPrecioventamenu()<10) {
			precioconpromocion=this.dietaasignada.getPrecioventamenu()-1;
			
		}
		else {
			double descuento= this.dietaasignada.getPrecioventamenu()*10/100;
			precioconpromocion=this.dietaasignada.getPrecioventamenu()-descuento;
		}
	}
	return precioconpromocion;
}
@Override
public String toString() {
	return "Cliente" + dni + hayquehacerpromocion()+" tiene promocion, precio sin promocion"+ this.dietaasignada.getPrecioventamenu() + ", precio final " + calculapreciopromocion();
}


}


