package OrientaciónAObjetos;

public class Notaasignatura {
public String nombre;
public int primerT;
public int segunT;
public int tercerT;





public Notaasignatura(String nombre, int primerT, int segunT, int tercerT) {
	super();
	this.nombre = nombre;
	this.primerT = primerT;
	this.segunT = segunT;
	this.tercerT = tercerT;
}
public float notamedia () {
	float notamedia=(primerT+segunT+tercerT)/3;
	
	return notamedia;
}
int trimestresaprobados() {
	int cuenta=0;
	
	if(primerT>=5) {
		cuenta= cuenta+1;
	}
	if(segunT>=5) {
		cuenta= cuenta+1;

	}
	if(tercerT>=5) {
		cuenta= cuenta+1;

	}
	return cuenta;
}
@Override
public String toString() {
	return "Notaasignatura [nombre=" + nombre + ", primerT=" + primerT + ", segunT=" + segunT + ", tercerT=" + tercerT
			+ "]";
}

}
