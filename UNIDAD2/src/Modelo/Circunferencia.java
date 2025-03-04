package Modelo;

public class Circunferencia extends Figura {
	



private static double pi=3.14;
private double radio;
	


	public Circunferencia(String color, double radio) {
	super(color);
	this.radio = radio;
}



	@Override
	public double calcularArea() {
		return pi*radio*radio;
	}
}
