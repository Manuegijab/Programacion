package Pruebas;

public class Gestionaequipos {
public static void main(String[] args) {
	Personas p1= new Personas("Andrea","Perea","12345678c",54);
	Personas p2= new Personas("Julian","Carmona","12365678c",34);
	Personas p3= new Personas("David","Alfaro","12345608c",18);
	Personas p4= new Personas("Fernando","Marquez","12375678c",21);

	Personas[]personas1= {p1,p2};
	Personas[]personas2= {p3,p4};
	int[]puntuaciones1= {7,14,22};
	int[]puntuaciones2= {40,12,3};
	Equipo equipo1= new Equipo("Equipo1",puntuaciones1,personas1);
	Equipo equipo2= new Equipo("Equipo2",puntuaciones2,personas2);

	System.out.println(equipo1);
	Personas[]tablaPersonas=equipo1.participantes;
	for(int i=0; i<tablaPersonas.length; i++) {
		Personas p=tablaPersonas[i];
		System.out.println(p.dni);
	}
	System.out.println(equipo1.calculamediaedad());

	
	
	}
}
