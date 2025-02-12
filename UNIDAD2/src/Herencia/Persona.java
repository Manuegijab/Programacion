package Herencia;

import java.util.Objects;

public class Persona {
private String nombre;
private String email;
private int edad;
private float salario;




protected void concentrase() {
	 System.out.println("Método concentrarse del padre");
}
protected void concentrarse(String lugar) 
{
System.out.println("metodo concentrarse del padre con String" + lugar);	
}
protected void concentrarse(int dias) 
{
System.out.println("metodo concentrarse del padre con String" + dias);	
}


public Persona(String nombre, String email, int edad, float salario) {
	super();
	this.nombre = nombre;
	this.email = email;
	this.edad = edad;
	this.salario = salario;
}



public Persona(String nombre, String email) {
	super();
	this.nombre = nombre;
	this.email = email;
}
protected String getNombre() {
	return nombre;
}



protected void setNombre(String nombre) {
	this.nombre = nombre;
}



protected String getEmail() {
	return email;
}



protected void setEmail(String email) {
	this.email = email;
}



protected int getEdad() {
	return edad;
}



protected void setEdad(int edad) {
	this.edad = edad;
}



protected float getSalario() {
	return salario;
}



protected void setSalario(float salario) {
	this.salario = salario;
}



@Override
public int hashCode() {
	return Objects.hash(edad, email, nombre, salario);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Persona other = (Persona) obj;
	return edad == other.edad && Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre)
			&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario);
}



@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", salario=" + salario + "]";
}






}
