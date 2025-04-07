package Modelo;

import java.util.HashMap;
import java.util.Map;
 
public class GestionaDespensa {
public static void main(String[] args) {
	
	
	RepositorioDespensa despensa= new RepositorioDespensa();
	
	despensa.agregarproducto("arroz1", 2);
	System.out.println(despensa.mostrarproductos());
	
	
}
}
