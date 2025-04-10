package Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GestionaNotas {
public static void main(String[] args) {
	GestionaNotas a = new GestionaNotas();
	Map <Persona,Nota> notas= new HashMap<Persona,Nota>(); 
	Persona p1= new Persona("Pablo");
	Persona p2= new Persona("Sofia");
	Persona p3= new Persona("Pedro");

	Nota n1= new Nota(1);
	Nota n2= new Nota(8);
	Nota n3= new Nota(9);

	notas.put(p1, n1);
	notas.put(p2, n2);
	notas.put(p3, n3);
	
	float medianotas= a.calculamedia(notas);
	System.out.println(medianotas);
	List<String> hola = a.getAlumnoporencimanota(notas);
	
	System.out.println(hola);;
}	
public float calculamedia(Map<Persona,Nota> notas) {
	float media=0;
	Collection<Nota> collecionnotas= notas.values();
	int sumanotas=0;
	for (Nota nota : collecionnotas) {
		sumanotas= nota.getNota() + sumanotas;
		media=sumanotas/notas.size();		
	}
	return media;
}

public List<String> getAlumnoporencimanota (Map<Persona,Nota> notas) {
	List<String> nombreAlumnos= new ArrayList<>();
	float notamedia= calculamedia(notas);
	Set<Map.Entry<Persona, Nota>> entradas = notas.entrySet();
	Entry <Persona,Nota> elemento = null;
	Iterator<Entry<Persona, Nota>> it = entradas.iterator();
	

	while (it.hasNext()) {
		elemento = it.next();
		Nota nota =elemento.getValue();
		float notanumerica= nota.getNota();
		Persona alumno= elemento.getKey();
		
		if(notanumerica>notamedia) {
			String nombrealumno= alumno.getNombre();
			nombreAlumnos.add(nombrealumno);
		}
		
	}

	return nombreAlumnos;
	
}
	
}
