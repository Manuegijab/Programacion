package Boletin2;
import java.util.Scanner;
public class Ejercicio8 {
public static void main(String[] args) {
	Scanner descuento=new Scanner(System.in);
	System.out.println("Ingresa tu edad:");
	int edad= descuento.nextInt();
	System.out.println("Precio producto");
	int precio= descuento.nextInt();
	
	float preciofinal;
	preciofinal= edad>60 ? precio-precio*0.3F: precio-precio*0.1F;
	System.out.println("El precio final sería " + preciofinal );
	
}
}
