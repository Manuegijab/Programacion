package FutureCars;

import java.util.Objects;

public class Sensor {
private double distancia;

private double velocidad;

public Sensor(double distancia, double velocidad) {
	super();
	setDistancia(distancia);
	this.distancia = getDistancia();
	setVelocidad(velocidad);
	this.velocidad =getVelocidad();
}
public double getDistancia() {
	return distancia;
}
public void setDistancia(double distancia) {
	if(distancia>0) {
	this.distancia = distancia;}
	else {
		this.distancia=0;
	}
}
public double getVelocidad() {
	return velocidad;
}
public void setVelocidad(double velocidad) {
	if(velocidad>0) {
		this.velocidad = velocidad;}
	else {
		this.velocidad=0;}
}
@Override
public int hashCode() {
	return Objects.hash(distancia, velocidad);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Sensor other = (Sensor) obj;
	return Double.doubleToLongBits(distancia) == Double.doubleToLongBits(other.distancia)
			&& Double.doubleToLongBits(velocidad) == Double.doubleToLongBits(other.velocidad);
}
@Override
public String toString() {
	return "Sensor [distancia=" + distancia + ", velocidad=" + velocidad + "]";
}


}
