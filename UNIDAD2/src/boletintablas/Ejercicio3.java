package boletintablas;
import java.util.Scanner;
public class Ejercicio3 {
public static void main(String[] args) {
	int numeros[]= {1,3,4,6,8};
	int i=0;
	Scanner numerousuario=new Scanner(System.in);
	System.out.println("Dime un numero");
	int numeroelegido=numerousuario.nextInt();
	boolean encontrado = false;
	while(numeros.length>=i && !encontrado ) {
	
	if (numeroelegido<numeros[i]) {
		System.out.println("Estaría en la posicion "+ -i);
		encontrado = true;
	}
	else if(numeroelegido==numeros[i]) {
		System.out.println("Está en la posicion "+i);
		encontrado = true;
		
	}
	else{
		i++;
		if (i>numeros.length) {
			System.out.println("Estaria en la posicion"+ -i);
		}
	}}}}


