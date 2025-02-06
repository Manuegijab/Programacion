package Boletin3OO;

public class Gestionavehiculo {
public static void main(String[] args) {
	Vehiculos coche1= new Vehiculos("Renault", "Modus", 2005, "Gasoil", 49, 30, 4.5F);
		System.out.println(coche1.necesitarespostar());
		System.out.println(coche1.calculaconsummocombustible());
		System.out.println(coche1.necesitarespostar());
}
}
