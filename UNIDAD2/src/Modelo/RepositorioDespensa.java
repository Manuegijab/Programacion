package Modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class RepositorioDespensa {

	private Map<String , Integer> despensa;
	
	
	
	public RepositorioDespensa() {
		super();
		this.despensa = new HashMap<>();
	}



	


	public boolean agregarproducto (String codigo, Integer cantidades) {
		boolean existe=true;
		if(despensa.containsKey(codigo)) {
			System.out.println("Este producto ya existe");
			existe=false;
		}
		else {
			despensa.put(codigo, cantidades);		
		
		}
	
		return existe;
	}
	
	public String mostrarproductos() {
		Iterator<Map.Entry<String, Integer>> it  = despensa.entrySet().iterator();
		String codigo = "";
		Integer cantidades=0;
		
			while(it.hasNext()) {
				Map.Entry<String, Integer> productos= it.next();
				
				 codigo= productos.getKey();
				 cantidades= productos.getValue();
			
				
			}
			return "Codigo:" + codigo + "Cantidades" + cantidades;

	}
}
