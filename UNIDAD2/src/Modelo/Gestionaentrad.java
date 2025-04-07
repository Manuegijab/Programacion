package Modelo;

import java.util.Map;
import java.util.TreeMap;
import java.security.KeyStore.Entry;
import java.time.LocalDate;
import java.util.Iterator;

public class Gestionaentrad {


public static void main(String[] args) {
	Map <Influencer,EntradaVIP> registro = new TreeMap <>();
	RegistroEntradas a = new RegistroEntradas(registro);

	Influencer c1= new Influencer ("Joseca", "JC", 123124, "Tinder");

	EntradaVIP e1= new  EntradaVIP("213", LocalDate.now(), TipoEntrada.SILVER, EstadoEntrada.ENVIADA);
	
	
	registro.put(c1, e1);
	
	System.out.println(a.conseguirestadoentrada(c1.getNick(), c1.getPlataforma()));
	
}



}
