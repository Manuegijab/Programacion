package SimulacroPOO;

public class Gestionaempleado {
public static void main(String[] args) {
	Administrativo a1= new Administrativo("Carlos", "12345678N", 1200);
	Directivo d1= new Directivo("Juan", "23456789N",2800,15);
	
	a1.calcularsalario();
	d1.calcularsalario();
	System.out.println(a1);
	System.out.println(d1);
}
}
