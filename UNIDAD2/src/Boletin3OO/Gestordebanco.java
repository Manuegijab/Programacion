package Boletin3OO;

import java.time.LocalDate;

public class Gestordebanco {
public static void main(String[] args) {
	Persona titular= new Persona("12345678N", "Julian", "Navas", LocalDate.of(2004, 10, 12));
	Persona autorizado= new Persona("12745678N", "Pablo", "Lopez", LocalDate.of(2004, 10, 12));

	Cuentabanco cuenta= new Cuentabanco (0.0, "ES12345678901234567890", titular);

	
	cuenta.setAutorizado(autorizado);
	cuenta.ingresardinero(autorizado, 100);
	System.out.println(cuenta);

}
}
