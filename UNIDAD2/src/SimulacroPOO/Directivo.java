package SimulacroPOO;

import java.util.Objects;

public final class Directivo extends Empleado  {



private double bonificacionsalario;



public Directivo(String nombre, String dni, float salariobase, double bonificacionsalario) {
	super(nombre, dni, salariobase);
	this.bonificacionsalario = bonificacionsalario;
}




public double getBonificacionsalario() {
	return bonificacionsalario;
}




public void setBonificacionsalario(double bonificacionsalario) {
	this.bonificacionsalario = bonificacionsalario;
}









public double calcularsalario () {
	double salarioañadir =  (getSalariobase()*bonificacionsalario)/100;
	double salariototal= getSalariobase()+salarioañadir;
	return salariototal;
}










@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(bonificacionsalario);
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
	Directivo other = (Directivo) obj;
	return Double.doubleToLongBits(bonificacionsalario) == Double.doubleToLongBits(other.bonificacionsalario);
}



}
