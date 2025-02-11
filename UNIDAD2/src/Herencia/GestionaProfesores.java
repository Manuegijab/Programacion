package Herencia;

import java.time.LocalDate;

public class GestionaProfesores {
public static void main(String[] args) {
	Profesorinterino interino1= new Profesorinterino("Pepe", "Inglés", LocalDate.now().plusMonths(6));
	Profesor interino2= new Profesorinterino("Pepa", "Historia", LocalDate.now().plusMonths(4));
	
	System.out.println(interino1.getFechafincontrato());
	Profesorinterino p3 =(Profesorinterino)interino2; //Down Casting del tipo padre convierto al tipo hijo
	
	System.out.println(p3.getFechafincontrato());

	ProfesorTitular titular1= new ProfesorTitular("Antonio", "Filosofía", LocalDate.now().minusYears(1));
	System.out.println(titular1.getFechaAdjudicacionPlaza());
	Profesor titular2= new ProfesorTitular("Antonia", "Lengua", LocalDate.now().minusYears(2));
	ProfesorTitular t3= (ProfesorTitular) titular2;
	System.out.println(t3.getFechaAdjudicacionPlaza());
	
	Profesor p4= (Profesor)interino1; //Up casting de hijo convierto a padre
	System.out.println(p4.getSueldo());
	
	ProfesorTitular p5 = (ProfesorTitular) interino2;
}
}
