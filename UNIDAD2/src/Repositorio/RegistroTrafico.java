package Repositorio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Modelo.Vehiculo;

public class RegistroTrafico {
	
	private HashMap<String, Vehiculo> listaVehiculo;

	public RegistroTrafico() {
		super();
		this.listaVehiculo = new HashMap<String, Vehiculo>();
	}

	public HashMap<String, Vehiculo> getListaVehiculo() {
		return listaVehiculo;
	}

	public void setListaVehiculo(HashMap<String, Vehiculo> listaVehiculo) {
		this.listaVehiculo = listaVehiculo;
	}
	
	public void addVehiculo(String bastidor,Vehiculo v) {
		listaVehiculo.put(bastidor, v);
	}
	
	public void addRematricula() {
		
	}
	
	public Vehiculo buscarPorVin(String bastidor) {
        return listaVehiculo.get(bastidor);
    }

	public void encontrarDueno(String propietario) {
		
		Iterator<Map.Entry<String, Vehiculo>> iterator = listaVehiculo.entrySet().iterator();
	    
	    while (iterator.hasNext()) {
	        Map.Entry<String, Vehiculo> entry = iterator.next();
	        Vehiculo vehiculo = entry.getValue();
	        
	        if (vehiculo.getProActual().equals(propietario)) {
	            System.out.println(vehiculo);
	        }
	    }
	}
	
	
	
}
