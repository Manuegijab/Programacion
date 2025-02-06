package Boletinpython;
import java.util.Scanner;
public class Gasolinera {
public static void main(String[] args) {
	int opcion;
	do {
		System.out.println("1.Asignar Surtidor");
		System.out.println("2.Consultar estado");
		System.out.println("3.Asignar Precio");
		System.out.println("4.Recargar surtidor");
		System.out.println("5.Cerrar");
		
		Scanner elegir=new Scanner(System.in);
		 opcion=elegir.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Elegiste asignar surtidor");
			break;
		case 2:
			System.out.println("Elegiste consultar estado");
			break;
		case 3:
			System.out.println("Elegiste asignar precio");
			break;
		case 4:
			System.out.println("Elegiste recargar surtidor");
			break;
		case 5:
			System.out.println("Cerrando");
			break;
			
		}
		}
	while (opcion!=5);
}
}
