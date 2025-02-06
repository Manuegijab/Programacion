package Boletin4orientadoaobjetos;

public class Notaasignatura {
String nombre;
int primT;
int segunT;
int tercerT;

public float calculamedia() {
	float notamedia=(primT+segunT+tercerT)/3;
	return notamedia;
}
int calculanumtrimestreaprobado() {
	int trimestresaprobados=0;
	if(primT>=5) {
		trimestresaprobados=trimestresaprobados +1;
	}
	if(segunT>=5) {
		trimestresaprobados=trimestresaprobados +1;
	}
	if(tercerT>=5) {
		trimestresaprobados=trimestresaprobados +1;
	}
	return trimestresaprobados;
}

public String toString() {
	return "Notaasignatura [nombre=" + nombre + ", primT=" + primT + ", segunT=" + segunT + ", tercerT=" + tercerT
			+ "]";
}


}
