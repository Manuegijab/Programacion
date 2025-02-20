package ExamenYummyYummyCatering;

import java.time.LocalDate;

public class GestionaCatering {
public static void main(String[] args) {
	Menu m1= new Menu (1, "menu1", 1000, 15, 7, false, LocalDate.now(), 3, Tipodieta.VEGANO);
	Menu m2= new Menu (2, "menu2", 900, 9, 2, false, LocalDate.now(), 3, Tipodieta.SIN_GLUTEN);
	Menu m3= new Menu (3, "menu3", 600, 16, 6, false, LocalDate.now(), 3, Tipodieta.VEGANO);

	Cliente c1= new Cliente ("12345678N", "Pablo", "Perez", 67, m3, LocalDate.of(1970, 12, 12), false);
	Cliente c2= new Cliente ("12335678N", "Julian", "Perez", 40, m2, LocalDate.of(1990, 12, 12), false);
	Cliente c3= new Cliente ("11335678N", "Victoria", "Perez", 21, m2, LocalDate.of(1990, 12, 12), true);
	Cliente c4= new Cliente ("11335678N", "Victoria", "Perez", -1, m2, LocalDate.of(1990, 12, 12), true);

	System.out.println(c1);
	System.out.println(c4);
	
	System.out.println(c3);
	System.out.println(c2);
	
	System.out.println(c2.equals(c3));
	//No me da tiempo
}
}
