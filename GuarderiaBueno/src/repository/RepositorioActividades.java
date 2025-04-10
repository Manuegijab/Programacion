package repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import exceptions.GuarderiaException;
import models.*;

public class RepositorioActividades {
	private Collection<Actividad> activididades;

	public RepositorioActividades() {
		super();
		this.activididades= 
}

	public Collection<Actividad> getActivididades() {
		return activididades;
	}

	public void setActivididades(Set<Actividad> activididades) {
		this.activididades = activididades;
	}
	
	public boolean isAlumnoApuntado(String nombreActividad, LocalDate fechaActividad, Alumno a) throws GuarderiaException {
		boolean esta = false;
		// TODO

		return esta;
	}

	public void agregarAlumnoActividad(String nombreActividad, LocalDate fechaActividad, Alumno a)
			throws GuarderiaException {
		// TODO

	}

	public List<Alumno> getAlumnadoConAlergias(String nombreActividad, LocalDate fechaActividad) {
		List<Alumno> alergias = null;

		// TODO
		return alergias;
	}



	public List<Actividad> getListaActividades() {
		List<Actividad> actividades = null;

		// TODO
		return actividades;
	}

}
