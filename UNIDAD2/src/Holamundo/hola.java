package Holamundo;

import java.util.Scanner;

public class hola {

	public static void main(String[] args) {
		
	
	
	Scanner numerosE= new Scanner(System.in);
	System.out.println("¿Cuantos numeros consideras?");
	int numeroveces=numerosE.nextInt();
	int resultado = sumapares(numeroveces);
	
	System.out.println(sumapares(resultado));
	
	
	
	}

	static int sumapares(int x) {
		Scanner numerosE= new Scanner(System.in);

		int suma=0;
		int i=0;
		while(i<x) {
			System.out.println("Dame numero");
			
			int numeros= numerosE.nextInt();

			
		
		if (numeros%2==0) 
		{
			
			suma=suma+numeros;
			i++;
		}
		else {
			i++;
		}
		 
		 
		 
		 
		 
		
	}
		return suma;
}
}