package SimulacroOrientacion;

public class Administrativo extends Empleado{
	int extra;
	public Administrativo(String nombre, String dNI, int salariobase, int extra) {
		super(nombre, dNI, salariobase);
	}	
	int sumaSalarios () {
		int salarioConExtra = salarioBase + extra ; 
		return salarioConExtra;
	}
}
