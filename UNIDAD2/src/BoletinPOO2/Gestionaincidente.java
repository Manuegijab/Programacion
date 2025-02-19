package BoletinPOO2;

import java.time.LocalDate;

public class Gestionaincidente {
public static void main(String[] args) {
	Gestionaincidente f = new Gestionaincidente();

	Incidente i1= new Incidente(1, "Juan", "No se que ha pasado", LocalDate.of(2025, 2, 12), LocalDate.now(), Estado.CERRADA, Criticidad.GRAVE);
    Incidente i2 = new Incidente(2, "Ana", "Error en base de datos", LocalDate.of(2025, 1, 10), LocalDate.of(2025, 2, 5), Estado.CERRADA, Criticidad.CRITICA);
    Incidente i3 = new Incidente(3, "Luis", "Problema con red", LocalDate.of(2025, 2, 1), null, Estado.RESOLUCION, Criticidad.MEDIA);
    Incidente i4 = new Incidente(4, "Carlos", "Caída de servidor", LocalDate.of(2025, 1, 25), LocalDate.of(2025, 2, 3), Estado.CERRADA, Criticidad.CRITICA);
    Incidente i5 = new Incidente(5, "Marta", "Aplicación no responde", LocalDate.of(2025, 2, 15), null, Estado.REGISTRADA, Criticidad.LEVE);
    Incidente i6 = new Incidente(6, "Pedro", "Correo no funciona", LocalDate.of(2025, 1, 30), null, Estado.RESOLUCION, Criticidad.GRAVE);
    
    Usuario u1= new Usuario ("12345678N", "Juanita", "Departamento Pene");

	Equipo e1= new Equipo ("pc Juan", "12C.43A.67Q.09B", "Window");
	Equipo e2= new Equipo ("pc Pablo", "11C.63A.07Q.19B", "Window");

	Equipo e3= new Equipo ("pc Manuel", "10C.42A.68Q.02B", "Window");
	Equipo e4= new Equipo ("pc Pedro", "21C.34A.76Q.90B", "Window");

	
i1.setEquipo(e1);	
i2.setEquipo(e1);	
i3.setEquipo(e2);	
i4.setEquipo(e4);	

e1.setUsuarionombre(u1);
System.out.println(e1);

Incidente [] listaincidentes= {i1,i2,i3,i4,i5,i6};
f.esurgente(listaincidentes);


}
public void esurgente (Incidente [] listaincidentes) {
	for(int i=0;i<listaincidentes.length;i++) {

		if (listaincidentes[i].getCriticidad().equals(Criticidad.CRITICA) || listaincidentes[i].getCriticidad().equals(Criticidad.GRAVE) && listaincidentes[i].getFecharegistro().isBefore(LocalDate.now().minusDays(7))|| listaincidentes[i].getCriticidad().equals(Criticidad.MEDIA) && listaincidentes[i].getFecharegistro().isBefore(LocalDate.now().minusDays(30))){
			System.out.println("INCIDENCIA "+i+" URGENTE");
		}
		else {
			System.out.println("INCIDENCIA "+i+" NO ES URGENTE");
		}
	}
	
}


}