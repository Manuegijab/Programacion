package SimulacroOrientacion;

public class Directivo extends Empleado{
	int bonificacion ;
	public Directivo(String nombre, String dNI, int salariobase, int bonificacion) {
		super(nombre, dNI, salariobase);
	}
	
	int sumaBonificacion () {
		int bonificacionEmpleado = salarioBase + bonificacion;
		return bonificacionEmpleado;
	}
}
