package repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import models.Alumno;
import models.Taller;

public class RespositorioTaller {


    private List<Taller> talleres;

    public RespositorioTaller() {
        talleres = new ArrayList<>();
    }

    // Añadir nuevo taller
    public void agregarTaller(Taller taller) {
        talleres.add(taller);
    }

    // Buscar taller por nombre
    public Taller buscarTallerPorNombre(String nombre) {
        for (Taller t : talleres) {
            if (t.getNombre().equalsIgnoreCase(nombre)) {
                return t;
            }
        }
        return null;
    }

    // Inscribir alumno si cumple requisitos
    public void inscribirAlumnoATaller(String nombreTaller, Alumno alumno) throws InscripcionException {
        Taller taller = buscarTallerPorNombre(nombreTaller);
        if (taller == null) {
            throw new InscripcionException("El taller '" + nombreTaller + "' no existe.");
        } else if (alumno.getEdad()<taller.getEdadminima()) {
        	throw new InscripcionException ("No cumple la edad minima");
        	
        }else if (taller.getAforomaximo()<= talleres.size()) {
        	throw new InscripcionException("No quedan plazas");
        }
        else {
        	taller.getAlumnosinscritos().add(alumno);
        }
    }

    // Mostrar todos los alumnos de un taller
    public Set<Alumno> obtenerAlumnosDeTaller(String nombreTaller) {
    	Set<Alumno> alumnostaller = new HashSet();
        Taller taller = buscarTallerPorNombre(nombreTaller);
        if (taller != null) {

        	for (Alumno alumno : taller.getAlumnosinscritos()) {
				alumnostaller.add(alumno);
			}
			}
        
        return alumnostaller;
    }

    // Obtener talleres ordenados por número de alumnos
    public List<Taller> obtenerTalleresOrdenadosPorInscritos() {
        List<Taller> copia = new ArrayList<>(talleres);
        Collections.sort(copia);
        return copia;
    }

    // Obtener alumnos mayores de una edad en un taller
    public List<Alumno> obtenerAlumnosMayoresDe(String nombreTaller, int edadMinima) {
        Taller taller = buscarTallerPorNombre(nombreTaller);
        List<Alumno> mayores = new ArrayList<>();
        if (taller != null) {
            for (Alumno a : taller.getAlumnosinscritos()) {
                if (a.getEdad() > edadMinima) {
                    mayores.add(a);
                }
            }
        }
        return mayores;
    }

    // Obtener todos los talleres
    public List<Taller> getTodosLosTalleres() {
        return talleres;
    }
}

