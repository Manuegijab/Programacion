package Boletin1;
import java.util.Scanner; 

public class Ejercicio2 {

public static void main(String[] args) {
	
	Scanner numeros=new Scanner(System.in);
	int numero1,numero2;
	System.out.println("Ingrese numero");
	numero1= numeros.nextInt();
	System.out.println("Ingrese numero");
	numero2=numeros.nextInt();
	
	System.out.println(numero1*numero2);
}
}
