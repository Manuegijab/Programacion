package Examenjava;
import java.util.Scanner;
public class ParradoVocales {
public static void main(String[] args) {
	//Dado el texto ingresado, haremos una funcion que nos diga cuentas palabras hay con mas de 3 vocales consecutivas, y que irá sumando en una variable cuando encuentre una, para luego mostrarlo en pantalla, estas irán separadas en comas.
ParradoVocales f= new ParradoVocales();
Scanner sc= new Scanner (System.in);
System.out.println("Dime una lista de palabras separadas por comas");
String palabras=sc.next();
String[] palabrasseparadas =palabras.split(",");
String resultado= f.vocalesconsecutivas(palabrasseparadas);
System.out.println(resultado);

}

String vocalesconsecutivas(String [] palabrasseparadas) {
	String resultado="";
	int recuentopalabracon3vocales=0;
	String[] palabrascon3vocales=new String[palabrasseparadas.length];
	for(int i=0; i<palabrasseparadas.length;i++) {
		String palabras= palabrasseparadas[i];
		for(int j=0; j<palabras.length();i++) {
			char letra=palabras.charAt(j);
			if(letra == 'a' || letra=='e' || letra== 'i' || letra=='o'|| letra=='u' ) {
				letra=palabras.charAt(j+1);
				if(letra == 'a' || letra=='e' || letra== 'i' || letra=='o'|| letra=='u' ) {
					letra=palabras.charAt(j+1);
					if(letra == 'a' || letra=='e' || letra== 'i' || letra=='o'|| letra=='u' ) {
						recuentopalabracon3vocales++;
						palabrascon3vocales[i]=palabras;
						
					}
					
				}
				
			}
			
			
		}
		
		
	}
	resultado= "Hay"+recuentopalabracon3vocales+"palabras con al menos tres vocales consecutivas:"+ palabrascon3vocales;
	
	return resultado;
	
}


}
