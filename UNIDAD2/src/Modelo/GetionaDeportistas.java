package Modelo;

import java.time.LocalDate;

public class GetionaDeportistas {
 public static void main(String[] args) {
	 Prueba [] pruebas= new Prueba [50];
	
	Deportista c= new Corredor("Pablo", "Rumania", 69, 2123, 183);
	Prueba p =new Prueba("Prueba1", "Sevilla", LocalDate.now().plusDays(1), EstadoPrueba.PLANIFICADA);
	Prueba p2 =new Prueba("Prueba2", "Villaverde", LocalDate.now().plusDays(10), EstadoPrueba.PLANIFICADA);
	pruebas[0]=p;
	pruebas[1]=p2;
	c.setPruebas(pruebas);
	System.out.println(c.getpruebamascercana());
}
}
