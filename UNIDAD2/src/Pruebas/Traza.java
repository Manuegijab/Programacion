package Pruebas;
import java.util.Scanner;
public class Traza {
public static void main(String[] args) {
	int i;
	int j;
	for(i=1; i<=3;i++) {
		System.out.println("Bucle externo i="+i);
		
		j=1;
		while(j<=i) {
			System.out.println("...Bucle interno,j="+j);
			j++;
		}
	}
}
}
