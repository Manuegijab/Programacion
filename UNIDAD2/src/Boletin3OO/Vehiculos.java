package Boletin3OO;

import java.util.Scanner;

public class Vehiculos {
String marca;
String modelo;
int añofabricacion;
String tipocombustible;
float capacidadtanque;
float cantidadactualcombustible;
float consumomedio;



public Vehiculos(String marca, String modelo, int añofabricacion, String tipocombustible, float capacidadtanque,
		float cantidadactualcombustible, float consumomedio) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.añofabricacion = añofabricacion;
	this.tipocombustible = tipocombustible;
	this.capacidadtanque = capacidadtanque;
	this.cantidadactualcombustible = cantidadactualcombustible;
	this.consumomedio = consumomedio;
}
float calculaconsummocombustible() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Cuantos kilometros ha recorrido?");
	float kilometrosrecorridos= sc.nextFloat();
	float consumocombustible= (consumomedio*kilometrosrecorridos)/100;
	cantidadactualcombustible= cantidadactualcombustible-consumocombustible;
	
	return consumocombustible;
}
boolean necesitarespostar() {
	boolean repostar=false;
	float porcentajecombustibleactual= (100*cantidadactualcombustible)/capacidadtanque;
	if(porcentajecombustibleactual<20) {
		repostar=true;
		
	}
	return repostar;
}
@Override
public String toString() {
	return "Vehiculos [marca=" + marca + ", modelo=" + modelo + ", añofabricacion=" + añofabricacion
			+ ", tipocombustible=" + tipocombustible + ", capacidadtanque=" + capacidadtanque
			+ ", cantidadactualcombustible=" + cantidadactualcombustible + ", consumomedio=" + consumomedio + "]";
}



}
