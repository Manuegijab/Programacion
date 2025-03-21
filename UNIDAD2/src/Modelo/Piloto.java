package Modelo;

import java.util.Objects;

public abstract class Piloto implements IVuelo {
String nombre;
String nacionalidad;
int edad;
int numerodelicencia;
int totalhorasdevuelo;
Vuelo[] vuelosasignados;



public int getduracionvuelo() {
	
	
	return 0;
}


public int contarvuelos() {
	return edad;
	
}

public void agregarvuelos() {
	
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Piloto other = (Piloto) obj;
	return numerodelicencia == other.numerodelicencia;
}


}
