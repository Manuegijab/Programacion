package EntornoDesarolloMANUELPARRADO;

import java.util.Arrays;
import java.util.Scanner;



public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] numerosreverse = new int[10];

   
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número");
            int numeroAñadir = sc.nextInt();
            numeros[i] = numeroAñadir;
        }

     
        System.out.println("Imprimiendo en orden inverso.");
        for (int i = numeros.length - 1; i >= 0; i--) {
        	System.out.println(numeros[i]);
        		
           
       }
        System.out.println(Arrays.toString(numerosreverse));
   
    }
}
