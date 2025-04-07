package Modelo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class RegistroEntradas {

	
	private Map <Influencer,EntradaVIP> registro;
	
	
	
	
	



	public RegistroEntradas(Map<Influencer, EntradaVIP> registro) {
		super();
		this.registro = registro;
	}

	public void añadirEntrada(Influencer i, EntradaVIP e) {

        if(registro.containsKey(i)) {
            System.out.println("No se puede añadir, ya existe");
        }
        else {
        	registro.put(i, e);
            e.setEstadoentrada(EstadoEntrada.ENVIADA);
        }

    }
	
	public EntradaVIP conseguirestadoentrada (String nick, String plataforma) {		  
		 
		Iterator<Map.Entry<Influencer,EntradaVIP>> it = registro.entrySet().iterator();
		 EntradaVIP estadoentrada= null;

		  while (it.hasNext()) {
			  Map.Entry<Influencer,EntradaVIP> entrada = it.next();
			  Influencer valorkey = entrada.getKey();  
	
		  if(valorkey.getNick().equals(nick) && valorkey.getPlataforma().equals(plataforma)) {
			  
			
			estadoentrada= entrada.getValue();
			  
			  
		  }
		  }
		return estadoentrada;
	}}
