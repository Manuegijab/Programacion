package Controlador;

import Modelo.*;

public class GestionaAnimal {
public static void main(String[] args) {
	Animal p1= new Perro();
	Animal p2= new Gato();
	System.out.println(p1.getAlimento());
	System.out.println(p1.getSonidoEmite());

}

}
