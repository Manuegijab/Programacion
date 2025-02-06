package Boletin4orientadoaobjetos;

public class Gestionagatos {
public static void main(String[] args) {
	Gatos julian= new Gatos();
	julian.color="negro";
	julian.comida="pienso";
	 julian.sexo="hembra";

	 Gatos ulises= new Gatos();
	 ulises.color="naranja";
	 ulises.comida="pescado";
	 ulises.sexo="macho";
	 
	 Gatos escuadra= new Gatos();
	 escuadra.color="pus";
	 escuadra.comida="pescado";
	 escuadra.sexo="hembra";
	 
	
	 julian.gatomaulla();
	 String juliancome= julian.comegato(julian);
	 System.out.println(juliancome);
		

	 ulises.ronronea();;
		 String ulisescome= ulises.comegato(ulises);
		 System.out.println(ulisescome);
		
		 
		String peleamachohembra= escuadra.peleagato(ulises);
		System.out.println(peleamachohembra);
		
		String mismosexo= julian.peleagato( escuadra);
		System.out.println(mismosexo);
		
		String ulisescadena= ulises.toString();
		System.out.println(ulisescadena);
}
}
