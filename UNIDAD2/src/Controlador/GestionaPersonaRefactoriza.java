package Controlador;
import Modelo.*;
public class GestionaPersonaRefactoriza {
	public static void main(String[] args) {
		PersonaRefactoriza carlos= new PersonaRefactoriza("Carlos");
		Accion[] acciones= carlos.getAcciones();
		acciones[0]=new Estudiante(null);
		System.out.println(carlos);	
		}
}
