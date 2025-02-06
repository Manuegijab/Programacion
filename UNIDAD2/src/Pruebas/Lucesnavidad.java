package Pruebas;
import java.util.Scanner;
public class Lucesnavidad {
public static void main(String[] args) {
	String estafundido;
	Scanner fundido=new Scanner(System.in);
	int luces=0;
	int contadornofundido=0;
	int contadorfundido=0;
	
	while(luces<10)
	{
		System.out.println("Esta fundido? (S/N)");
		estafundido=fundido.next();
		if(estafundido.equals("S") | estafundido.equals("s"))  {
			contadorfundido++;
			luces++;

			
		}
		else if(estafundido.equals("N") | estafundido.equals("n")) {
			contadornofundido++;
			luces++;


		}
		else {
			System.out.println("Quillo ayudame (S/N)");
			estafundido=fundido.next();

		}
		 
	}
	if (contadorfundido>5) {
		System.out.println("Nos devuelven el dinero");
	}
	else {
		System.out.println("No compramos más aquí");
	}
}
}
