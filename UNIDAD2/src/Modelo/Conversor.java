	package Modelo;

public class Conversor {
private static final double EUROS=0.95;

private double dolares;


protected double getDolares() {
	return dolares;
}
protected void setDolares(double dolares) {
	this.dolares = dolares;
}
protected static double getEuros() {
	return EUROS;
}
public Conversor(double dolares) {
	super();
	this.dolares = dolares;
}
public static double Conversordinero (int i) {
	return i*EUROS;
}

}
