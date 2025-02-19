package SimulacroPOO;

import java.util.Objects;

public class Administrativo extends Empleado {
	
	private double extraproductividad;






public Administrativo(String nombre, String dni, float salariobase, double extraproductividad) {
		super(nombre, dni, salariobase);
		this.extraproductividad = extraproductividad;
		
	}

public double calcularsalario () {
	double salarioañadir= extraproductividad + getSalariobase();

	return salarioañadir;
	
}

public double getExtraproductividad() {
	System.out.println("ola");

	return extraproductividad;
}

public void setExtraproductividad() {
	this.extraproductividad = extraproductividad;
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
