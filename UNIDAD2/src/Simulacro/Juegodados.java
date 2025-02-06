package Simulacro;

import java.util.Random;
import java.util.Scanner;
public class Juegodados {
public static void main(String[] args) {
//primero se hará la función imprimemenu, la funcion apostar pedirá el numero sobre el que apuesta y la cantidad apostada y devolverá la suma
	Juegodados f=new Juegodados();

	int opcion= f.imprimemenu();
	int numeroapuesta = 0;
	int dineroapuesta;
	int sumadados = 0;
	int dineroganancias=0;
	int numerovecesjugado=0;
	String[]historial= new String[200];
	while(opcion<3) {
		switch(opcion) {
		case 1:{
			 numeroapuesta=f.preguntarapuesta();
			 dineroapuesta= f.dineroapuesta();
			 sumadados=f.lanzardadoysuma();			
			dineroganancias= dineroganancias + f.gestionarganancias(numeroapuesta,dineroapuesta,sumadados);
			numerovecesjugado= numerovecesjugado+1;
			historial= f.mostrarhistorial(numerovecesjugado, numeroapuesta, sumadados, dineroganancias);
			break;
			
		}
		case 2: {
			
			historial=f.mostrarhistorial(numerovecesjugado, numeroapuesta, sumadados, dineroganancias);
			System.out.println();
			break;
		}
		}
		opcion= f.imprimemenu();
}


}
 int imprimemenu() {
	Juegodados f=new Juegodados();
	Scanner sc=new Scanner(System.in);
	System.out.println("APOSTAR 1");
	System.out.println("MOSTRAR HISTORIAL 2");
	System.out.println("RETIRARSE 3 ");
	int opcion=sc.nextInt();
	return opcion;

}
int preguntarapuesta() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Dime tu apuesta:");
	int numeroapuesta=sc.nextInt();
	return numeroapuesta;
	
}
boolean validarapuesta( int numeroapuesta) {
	boolean valido=true;
	if (numeroapuesta<2) {
		valido=false;
		
	}
	return valido;

}

int dineroapuesta() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Cuanto dinero quieres apostar?");
	int cantidadapostada=sc.nextInt();
	return cantidadapostada;
	
}
boolean validardinero( int dineroapuesta) {
	boolean valido=true;
	if (dineroapuesta>0) {
		valido=false;
		
	}
	return valido;

}
int gestionarganancias(int numeroapuesta, int dineroapuesta, int sumadados) {
	int dineroganancia=0;
	
	if (numeroapuesta==sumadados) {
		dineroganancia=dineroganancia+dineroapuesta*2;
	}
	else {
		dineroganancia=dineroganancia-dineroapuesta;
	}
	return dineroganancia;
}

int lanzardadoysuma() {
	Random randomnumber=new Random();
	int dado1= randomnumber.nextInt();
	int dado2= randomnumber.nextInt();
	int sumadados=dado1+dado2;
	return sumadados;
}
String[] mostrarhistorial( int numerodevecesjugado,int numeroapuesta,int sumadados,int dineroganacias) {
	
	String[]historial= new String[200];
	String datos="";
	
	if(numeroapuesta==sumadados) {
	 datos= "En la" + numerodevecesjugado +"jugada apostó al valor "+ numeroapuesta+" y sumó "+sumadados+ "ganando " + dineroganacias + ".";
	}
	else {
	 datos= "En la" + numerodevecesjugado +"jugada apostó al valor "+ numeroapuesta+" y sumó "+sumadados+ "perdiendo " + dineroganacias + ".";
	}
	
	historial[numerodevecesjugado-1]=datos;
	return historial;
}



}
