package SimulacroPOO;

public class Gestionaempleado {
public static void main(String[] args) {
	Administrativo a1= new Administrativo("Carlos", "12345678N", 1200,40);
	Directivo d1= new Directivo("Juan", "23456789N",2800,15);
	Administrativo a2= new Administrativo("Carlos", "12345678N", 1200,40);

	
	boolean iguales= a1.equals(a2);
	
	System.out.println(iguales);
	
	System.out.println(a1);
	System.out.println(d1);
}
}
