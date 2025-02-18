package SimulacroOrientacion;

public class GestionaEmpleado {
	public static void main(String[] args) {
		Administrativo carlos = new Administrativo ("Carlos", "12345678A", 1200, 40);
		Directivo juan = new Directivo ("Juan", "87654321C", 2800, 15);
		System.out.println(carlos.toString());
		System.out.println(juan.toString());
	}
	
}
