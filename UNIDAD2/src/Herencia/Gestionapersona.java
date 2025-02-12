package Herencia;

public class Gestionapersona {
public static void main(String[] args) {
	Persona p=new Persona ("Pepe", "pepe@gmail.com");
	Persona p2=new Persona ("Pepe", "pepe@gmail.com");
	
	//Sobrecarga 
	p.concentrarse( 20);
	p.concentrarse(" Barcelona");
	p.concentrase();
}
}
