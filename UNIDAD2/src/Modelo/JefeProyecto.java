package Modelo;

public class JefeProyecto extends AEmpleado {

	boolean hablaingles;
	String certificaciones;
	Proyecto proyecto;
	
	
	public JefeProyecto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JefeProyecto(String nombre, String identificador, String apellidos, float salario,
			boolean tieneReduccionHoraria, Categoria categoria) {
		super(nombre, identificador, apellidos, salario, tieneReduccionHoraria, categoria);
		// TODO Auto-generated constructor stub
	}

	public JefeProyecto(boolean hablaingles, String certificaciones, Proyecto proyecto) {
		super();
		this.hablaingles = hablaingles;
		this.certificaciones = certificaciones;
		this.proyecto = proyecto;
	}

	@Override
	public float calculaimporteNomina() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String devuelvefunciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void imprimeHorario() {
		// TODO Auto-generated method stub
		
	}

}
