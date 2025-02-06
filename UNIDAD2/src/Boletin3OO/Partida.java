package Boletin3OO;

public class Partida {
	private String nombrejuego;
	private Participante[] participantes;
	private String ganador;


public Partida(String nombrejuego, Participante[] participantes) {
	super();
	this.nombrejuego = nombrejuego;
	this.participantes = participantes;
}

private int jugadorconmayorpuntuacion() {
	int puntuacionmaxima=0;
	for(Participante p: participantes) {
		if (puntuacionmaxima<p.getPuntuacion()) {
			puntuacionmaxima=p.getPuntuacion();
		}
	}
	return puntuacionmaxima;
	
}


public String getNombrejuego() {
	return nombrejuego;
}

public void setNombrejuego(String nombrejuego) {
	this.nombrejuego = nombrejuego;
}

public Participante[] getParticipantes() {
	return participantes;
}

public void setParticipantes(Participante[] participantes) {
	this.participantes = participantes;
}

public String getGanador() {
	return ganador;
}

public void setGanador(String ganador) {
	this.ganador = ganador;
}

void imprimeganador() {
	int puntuacionmaxima=jugadorconmayorpuntuacion();

	for (int i=0;i<participantes.length;i++) {
		Participante p= participantes[i];
		if(puntuacionmaxima==p.getPuntuacion()) {
			System.out.println("El jugador con mas puntuacion es "+ p.getNombre() + " con " + p.getPuntuacion() + " puntos");
			ganador=p.getNombre();
		}
	}
	
	
}

@Override
public String toString() {
	String ganador;
	return "Partida [nombrejuego=" + nombrejuego + ", participantes=" + participantes + "]";
}


}
