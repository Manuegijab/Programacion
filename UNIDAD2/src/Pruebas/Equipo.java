package Pruebas;

import java.util.Arrays;

public class Equipo {
String nombretipo;
int [] puntuaciones;
Personas[]participantes;

public Equipo(String nombretipo, int[] puntuaciones, Personas[] participantes) {
	super();
	this.nombretipo = nombretipo;
	this.puntuaciones = puntuaciones;
	this.participantes = participantes;
}

float calculamediaedad() {
	float mediaEdad=0f;
	int edades=0;
	Personas[] tablapersonas= this.participantes;
	for(Personas p:tablapersonas)
	{
		edades=edades + p.edad;
	}
	mediaEdad=edades/tablapersonas.length;
	return mediaEdad;
}

@Override
public String toString() {
	return "Equipo [nombretipo=" + nombretipo + ", puntuaciones=" + Arrays.toString(puntuaciones) + ", participantes="
			+ Arrays.toString(participantes) + "]";
}


}
