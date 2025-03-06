package Controlador;

import Modelo.*;

public class GestionaAnimal {
public static void main(String[] args) {
	Serpiente s1= new Serpiente();
	AvesRapaces a1= new AvesRapaces();
	AvesRapaces a2= new AvesRapaces();
	Roedor r1= new Roedor();
	Leon l1= new Leon();
	
	System.out.println(s1.huir(a1));
	System.out.println(a1.atacar(r1  ));
}

}
