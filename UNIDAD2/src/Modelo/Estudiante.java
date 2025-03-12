package Modelo;

public class Estudiante extends PersonaRefactoriza implements Accion{

	public Estudiante(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ejecutaaccion() {
		// TODO Auto-generated method stub
		return"Estudio";
		
	}

	@Override
	public String toString() {
		return ejecutaaccion();
	}
	

}
