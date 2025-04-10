	package models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Taller implements Comparable<Taller>{
private int id;
static private int contadorid;
private String nombre;
private int edadminima;
private int aforomaximo;
private Set <Alumno> alumnosinscritos;

public Taller(int id, String nombre, int edadminima, int aforomaximo, Set<Alumno> alumnosinscritos) {
	super();
	this.id = contadorid;
	this.nombre = nombre;
	this.edadminima = edadminima;
	this.aforomaximo = aforomaximo;
	this.alumnosinscritos = new HashSet<>();
	contadorid=contadorid +1;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public static int getContadorid() {
	return contadorid;
}

public static void setContadorid(int contadorid) {
	Taller.contadorid = contadorid;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdadminima() {
	return edadminima;
}

public void setEdadminima(int edadminima) {
	this.edadminima = edadminima;
}

public int getAforomaximo() {
	return aforomaximo;
}

public void setAforomaximo(int aforomaximo) {
	this.aforomaximo = aforomaximo;
}

public Set<Alumno> getAlumnosinscritos() {
	return alumnosinscritos;
}

public void setAlumnosinscritos(Set<Alumno> alumnosinscritos) {
	this.alumnosinscritos = alumnosinscritos;
}

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Taller other = (Taller) obj;
	return id == other.id;
}

@Override
public int compareTo(Taller o) {
	// TODO Auto-generated method stub
	return Integer.compare(this.alumnosinscritos.size(), o.alumnosinscritos.size());
}


}
