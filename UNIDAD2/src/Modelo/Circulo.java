package Modelo;

public class Circulo {
private double radio;
private final static double pi=3.14;
private int id ;
private  static int contador;





public Circulo(double radio) {
	super();
	this.radio = radio;
	this.id= contador + 1;
	contador= contador + 1;
	
}
public double getRadio() {
	return radio;
}
public void setRadio(double radio) {
	this.radio = radio;
}


public double calculaArea() {
	return pi*radio*radio;
}
@Override
public String toString() {
	return "Circulo [ ID: "+ id + " radio= " + radio + " area "+ this.calculaArea() + "]";
}

}
