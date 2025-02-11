package EntornoDesarolloMANUELPARRADO;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	Ejercicio1 f= new Ejercicio1();
	
	String[] letras= {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
;
	int numerodni= f.pidedni();
	int posicionletradni=f.calculaposicionletradni(numerodni);
	String letradni=f.encuentraletradni(letras, posicionletradni);
	System.out.println("TU DNI ES:" + numerodni+ letradni);
	
	}
int pidedni() {
    Scanner sc = new Scanner(System.in);
    String numerodni = "0";
    boolean esvalido=true;

    while (esvalido) {
        System.out.println("Dime el numero de tu DNI (8 dígitos):");
        numerodni = sc.next();  

        if (numerodni.length() == 8 ) {
        	esvalido=false;
        } else {
            System.out.println("El número de DNI no es válido. Debe tener 8 dígitos y contener solo números.");
        }
    }
    

    return Integer.parseInt(numerodni);
}

int calculaposicionletradni(int numerodni) {
	int divisiondni=numerodni%23;
	return divisiondni;
}


String encuentraletradni(String[]letras,int posicionletradni) {
	
	return letras[posicionletradni];
}

}
