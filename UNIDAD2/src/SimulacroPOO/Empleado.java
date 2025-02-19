package SimulacroPOO;

import java.util.Objects;

public class Empleado {
private String nombre;
private String dni;
private double salariobase;



public Empleado(String nombre, String dni, float salariobase) {
	super();
	this.nombre = nombre;
	this.dni = dni;
	setSalariobase(salariobase);
	this.salariobase = salariobase;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getDni() {
	return dni;
}



public void setDni(String dni) {
	this.dni = dni;
}



public double getSalariobase() {
	return salariobase;
}



public void setSalariobase(double salariobase) {
	if (salariobase>0) {
	this.salariobase = salariobase;
}
	else{
		System.out.println("ERROR; El salario no puede ser negativo. El salario minimo es 1134");}
	}










@Override
public int hashCode() {
	return Objects.hash(dni, nombre, salariobase);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Empleado other = (Empleado) obj;
	return Objects.equals(dni, other.dni);
}

public double calcularsalario() {
	return salariobase;
}

@Override
public String toString() {
	return "DNI " + getDni() + " -Nombre: " + getNombre()+ " -Salario " + this.calcularsalario();

}






}
