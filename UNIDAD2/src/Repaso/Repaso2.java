package Repaso;

import java.util.Scanner;

public class Repaso2 {
public static void main(String[] args) {
	Scanner scn=new Scanner (System.in);
	Repaso2 r = new Repaso2();
	System.out.println("Dime una palabra");
	String palabra= scn.next();
	r.isMinuscula(palabra);
	String [] palabras= r.cargaTabla(scn);
	r.imprimeTabla(palabras);
	String[]numeros=r.cargaNumeros(palabras);
	r.realizaConversion(palabra);
	System.out.println(palabras);
	String[]minusculas=r.filtraminusculas(palabras);
	System.out.println();
	

}
 String[] cargaTabla (Scanner sc) {
	System.out.println("Dime una frase");
	String frase=sc.nextLine();	
	String [] palabras= frase.split(" ");
	return palabras;
}
  String imprimeTabla(String[]palabras) {
	 int i=0;
	 
	 while(i<palabras.length) {
		String palabraposicion=palabras[i];
		System.out.println(palabraposicion);
		i++;
	 }
	return null;
 }
  String[] cargaNumeros(String[]palabras) {
		 int i=0;
		 
		 while(i<palabras.length) {
			 
			String palabraposicion=palabras[i];
			for(i=0;i<palabraposicion.length();i++) {
				
			}
			System.out.println(palabraposicion);
			i++;
		 }
		return null;
  }
  boolean esNumero( String  []palabras) {
	  boolean es=false; 
	  for (int i=0;i<palabras.length; i++) {
		  Character c = palabras.charAt(i);
		  es=es&&Character.isDigit(c);

		  Character.isDigit(c);
		  
		  return es;
	  }
	  String[] filtraminusculas(String[]palabras) {
		  boolean es=false;
		  int i=0;
		  for (int i=0;i<palabras.length; i++) {
			  Character c = palabras.charAt(i);
			  es=es&&Character.isDigit(c);

			  Character.isDigit(c);
			  
			  return es;
		  
	  }
		  String realizaConversion(String palabra) {
			  int i=0;
			  Character.toUpperCase(palabra.charAt(0));
			  for(i=0;i<palabra.length();i++) {
				  if(palabra[i]="o") {
					  
				  }
			  }
			  
			  return palabraconvertida;
		  }
  boolean isMinuscula(String palabra) {
	  boolean esMin=false;
	  if(Character.isLowerCase(palabra.charAt(0))) {
	  esMin=true;
	  }
	  return esMin;
	  
	  
  }
  

 
}
