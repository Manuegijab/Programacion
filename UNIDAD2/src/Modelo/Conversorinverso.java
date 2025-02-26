package Modelo;

public class Conversorinverso {
	private static final double DOLARES=1.05;
private double euros;
protected double getEuros() {
	return euros;
}
protected void setEuros(double euros) {
	this.euros = euros;
}
protected static double getDolares() {
	return DOLARES;
}
public Conversorinverso(double euros) {
	super();
	this.euros = euros;
}

public static double Conversorinversodinero(int i) {
	return i*DOLARES;
}
}
