package Pruebas;

import java.util.Scanner;

public class Gestionapersonas {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	Persona p1=new Persona ("Pepe", 20);
	Persona p2= new Persona ("Pepa", 18);
	

String dni="";
System.out.println("DNI:");
dni= sc.next();
while (dni!="S") {
	
 System.out.println(Persona.validaSinDNIvalido(dni)); 
 System.out.println("DNI:");
 dni= sc.next();
}
}


}
