package Boletin4orientadoaobjetos;

public class Gatos {
String color;
String raza;
String sexo;
int edad;
float peso;
String comida;



public Gatos() {
	super();
	// TODO Auto-generated constructor stub
}
public Gatos(String color, String sexo, int edad, float peso, String comida) {
	super();
	this.color = color;
	this.sexo = sexo;
	this.edad = edad;
	this.peso = peso;
	this.comida = comida;
}
void gatomaulla () {
	
	System.out.println("miauuuuu");
}
String comegato (Gatos g1) {
	String satisfaccion;
	if(comida.equals("pescado")) {
		 satisfaccion="Yummy yummy";
	}
	else {
		 satisfaccion="buahhh, mejor no";
	}
	return satisfaccion;
}

void ronronea() {
	System.out.println("rrrrr");
	}

String peleagato(Gatos g1) {
	String pelea;
	
	if (sexo.equals(g1 .sexo)) {
		pelea="ven aqui que te vas a enterar";
	}
	else {
		pelea="la violencia nunca es la solución";
	}
	return pelea;
}
String convierteEnCadena() {
	String cadena= "Gato: color" +color + " sexo: " +sexo + " comida: " + comida ;
	return cadena;
}
public String toString() {
	return "Gatos [color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso
			+ ", comida=" + comida + "]";
}



}