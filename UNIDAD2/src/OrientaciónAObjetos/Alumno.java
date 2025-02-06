package OrientaciónAObjetos;

public class Alumno {
String nombre;
String apellidos;
String email;
Notaasignatura notaprogramacion;
Notaasignatura notabasededatos;



public Alumno(String nombre,  String email) {
	super();
	this.nombre = nombre;
	this.email = email;
}





@Override
public String toString() {
	return "Alumno [nombre=" + nombre + ", email=" + email + "]";
}

public void imprimeSiHaAprobado() {
	if (notaprogramacion.notamedia()>=5) {
		System.out.println("El alumno "+ nombre+ " ha aprobado la asignatura " + notaprogramacion.nombre);
		
	}
	else {
		System.out.println("El alumno "+ nombre+ " no ha aprobado la asignatura " + notaprogramacion.nombre);

	}
	if (notabasededatos.notamedia()>=5) {
		System.out.println("El alumno "+ nombre+ " ha aprobado la asignatura " + notabasededatos.nombre);
		
	}
	else {
		System.out.println("El alumno "+ nombre+ " no ha aprobado la asignatura " + notabasededatos.nombre);

	}
}


}
 