package SimulacroPOO;

import java.util.Objects;

public class Administrativo extends Empleado {
	
	private double extraproductividad;






public Administrativo(String nombre, String dni, float salariobase, double extraproductividad) {
		super(nombre, dni, salariobase);
		this.extraproductividad = extraproductividad;
		
	}

double calcularsalario () {
	double salarioañadir= extraproductividad + getSalariobase();
	double salariototal= salarioañadir + getSalariobase();
	return salariototal;
	
}

public double getExtraproductividad() {
	System.out.println("ola");

	return extraproductividad;
}

public void setExtraproductividad() {
	this.extraproductividad = extraproductividad;
}

@Override
public String toString() {
	return "DNI " + getDni() + " -Nombre: " + getNombre()+ " -Salario " + calcularsalario();
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(extraproductividad);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Administrativo other = (Administrativo) obj;
	return Double.doubleToLongBits(extraproductividad) == Double.doubleToLongBits(other.extraproductividad);
}

}
