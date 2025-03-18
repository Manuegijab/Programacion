package Modelo;

import java.util.Arrays;
import java.util.Random;

public class Divisiones1al10 {
public static void main(String[] args) {
	Random r= new Random();
	
	Float [] divisiones= new Float[20];
	int i=0;
	
	while(i<20) {
		try {
		int numero1= r.nextInt(10)+0;
		int numero2= r.nextInt(10)+0;
		Float division= (float) (numero1/numero2);
		divisiones[i]=division;
		i++;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Excepcion: imprimir posicion que no existe en la tabla");
			
			
		}
		catch(ArithmeticException a) {
			System.out.println("Excepcion: Dividió por 0");
		}
		catch(NullPointerException n) {
			System.out.println("Excepcion: Posicion nula");
		}
		}
	System.out.println(Arrays.toString(divisiones));
}
}
