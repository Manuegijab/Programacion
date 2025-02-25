package Pruebas;

public class Persona {
static int contador;
int id;
String nombre;
int edad;
public Persona(String nombre, int edad) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.edad = edad;
	contador=contador+1;
}
	
static boolean validaSinDNIvalido(String dni) {
	boolean dnivalido=true;
	
	if(dni.matches("\\d{8}[A-Za-z]{1}")) {
		
	}
	else {
		dnivalido=false;
	}
	return dnivalido;
}

}
