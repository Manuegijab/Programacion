package Boletin1;
import java.util.Scanner;
public class Ejercicio3 {
public static void main(String[] args) {
	Scanner area=new Scanner(System.in);
	int alto;
	System.out.println("Cual es el alto del rectangulo?");
	alto=area.nextInt();
	int ancho;
	System.out.println("Cúal es el ancho del rectangulo?");
	ancho=area.nextInt();
	
	System.out.println(alto*ancho);
}
}
