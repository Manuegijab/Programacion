package OrientaciónAObjetos;

public class Gestionaalumno {
	
	public static void main(String[] args) {
		
	
Alumno lucia=new Alumno("lucia", "lucia@gmail.com");
Alumno andres=new Alumno("andres", "andres@gmail.com");
Alumno vicente=new Alumno("vicente", "vicente@gmail.com");

Notaasignatura notaprogramacionlucia= new Notaasignatura("Programacion", 5, 7, 7);
Notaasignatura notabasededatoslucia= new Notaasignatura("Base de datos", 5, 7, 7);
lucia.notaprogramacion=notaprogramacionlucia;
lucia.notabasededatos=notabasededatoslucia;

Notaasignatura notaprogramacionandres= new Notaasignatura("Programacion", 4, 4, 6);
Notaasignatura notabasededatosandres= new Notaasignatura("Base de datos", 9, 8, 8);
andres.notaprogramacion=notaprogramacionandres;
andres.notaprogramacion=notabasededatosandres;

Notaasignatura notaprogramacionvicente= new Notaasignatura("Programacion", 2, 2, 3);
Notaasignatura notabasededatosvicente= new Notaasignatura("Base de datos", 6, 6, 7);
vicente.notaprogramacion=notaprogramacionvicente;
vicente.notabasededatos=notabasededatosvicente;

float notamediavicenteprogramacion= notaprogramacionvicente.notamedia();
float notamediavicentebasededatos= notabasededatosvicente.notamedia();

System.out.println(notamediavicenteprogramacion +","+notamediavicentebasededatos);

 vicente.imprimeSiHaAprobado();
 lucia.imprimeSiHaAprobado();


}
}