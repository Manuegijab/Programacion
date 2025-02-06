package OrientaciónAObjetos;

public class Cubo {
int lado;
float litroscontiene;
float capacidadmax;






public Cubo(int lado, float litroscontiene) {
	super();
	this.lado = lado;
	this.litroscontiene = litroscontiene;
	this.capacidadmax= calculavolumen();
	
}
float calculaarea() {
	float areacubo= 6*(lado*lado);
	return areacubo;
}
float calculavolumen() {
	float volumencubo= lado*lado*lado;
	return volumencubo;
}

boolean vaciarcubo(int numerolitros) {
	boolean posiblevaciar=true;
	
	if(numerolitros>litroscontiene) {
		
		 posiblevaciar=false;
	}
	litroscontiene= litroscontiene-numerolitros;

	return posiblevaciar;
}

boolean rellenar(int numerolitros) {
	boolean posiblerellenar=true;
	float litrosquequedanporllenar= capacidadmax-litroscontiene;
	if(numerolitros> litrosquequedanporllenar) {
		posiblerellenar=false;
	}
	litroscontiene= litroscontiene+numerolitros;

	return posiblerellenar;
}
@Override
public String toString() {
	return "Cubo [lado=" + lado + ", litroscontiene=" + litroscontiene + ", capacidadmax=" + capacidadmax + "]";
}

}
