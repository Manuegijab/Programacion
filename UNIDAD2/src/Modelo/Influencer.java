package Modelo;

import java.util.Objects;

public class Influencer implements Comparable{
private String nombre;
private String nick;
private double numSeguidores;
private String plataforma;

public Influencer(String nombre, String nick, double numSeguidores, String plataforma) {
	super();
	this.nombre = nombre;
	this.nick = nick;
	this.numSeguidores = numSeguidores;
	this.plataforma = plataforma;
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getNick() {
	return nick;
}
public void setNick(String nick) {
	this.nick = nick;
}
public double getNumSeguidores() {
	return numSeguidores;
}
public void setNumSeguidores(double numSeguidores) {
	this.numSeguidores = numSeguidores;
}
public String getPlataforma() {
	return plataforma;
}
public void setPlataforma(String plataforma) {
	this.plataforma = plataforma;
}


@Override
public int hashCode() {
	return Objects.hash(nick, plataforma);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Influencer other = (Influencer) obj;
	return Objects.equals(nick, other.nick) && Objects.equals(plataforma, other.plataforma);
}


@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public String toString() {
	return "Influencer [nombre=" + nombre + ", nick=" + nick + ", numSeguidores=" + numSeguidores + ", plataforma="
			+ plataforma + "]";
}


}
