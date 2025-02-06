package Repaso;

import java.util.Scanner;

public class Repaso4 {
public static void main(String[] args) {
	Repaso4 f=new Repaso4();
	
	
	System.out.println(f.sumacifras());
	
}

int sumacifras () {
	int suma=0;
	
	Scanner sc=new Scanner (System.in);
	System.out.println("Dime numero");
	String numeroparasumar= sc.next();
	System.out.println("Dime el numero de cifras que quieres sumar");
	int numerocifras= sc.nextInt();
	
	
	
	if(numeroparasumar.length()<numerocifras) {
		for(int i=0;i<numerocifras;i++) {
			
			String cifra=Character.toString(numeroparasumar.charAt(i));
			int numero= Integer.parseInt(cifra);
			
			
			suma=suma+numero;
	
		
	}
	
	
	}
	return suma;

}}
