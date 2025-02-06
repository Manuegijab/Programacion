 package Boletin1;
import java.util.Scanner;
public class Ejercicio5 {
public static void main(String[] args) {
	Scanner elegible =new Scanner(System.in);
	System.out.print("Membresia premium?(S/N)");
	String membresia=elegible.next();
	System.out.print("Ingresa el coste de tu cuenta:");
	int coste=elegible.nextInt();
	System.out.println("Ingresa tu edad:");
	int edad=elegible.nextInt();
	
	if(membresia=="S" && coste>50 || edad>65) {
	System.out.println("Aplica descuento");
	}
	else {
		System.out.println(" No aplica descuento");

	}
}
}
