package Pruebas;
import java.util.Scanner;
public class Renos {
public static void main(String[] args) {
	int nieve;
	int i=0;
	String almoadilla="#";
	String pista="";
	int r=0;
	int numerorenos=0;
	int posicionreno=0;
	int[] renos=new int[numerorenos];
	Scanner usuarioreno= new Scanner(System.in);
	
	
	System.out.println("Dime cuantos renos:");
	numerorenos=usuarioreno.nextInt();
	
	
	while(numerorenos>i) {
		
		System.out.println("Dime posición de cada reno");
		posicionreno = usuarioreno.nextInt();
		renos[posicionreno]= r;
		i++;
		System.out.println("@"+pista+"@"+i);

		
		}
	while (posicionreno > i){
		
		pista= pista+almoadilla;
		i++;
		System.out.println("@"+pista+"@"+i);

		}
		

	
	for (i=1; numerorenos>i;i++) {
		
		System.out.println("@"+pista+"@"+i);

		
	}
	
}
}
