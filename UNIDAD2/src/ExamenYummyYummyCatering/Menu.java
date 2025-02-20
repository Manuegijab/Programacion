package ExamenYummyYummyCatering;

import java.time.LocalDate;
import java.util.Objects;

public class Menu {
private int id;
private String nombre;
private double consumocalorico;
private double precioventamenu;
private double preciocostemenu;
private boolean frutossecos;
private LocalDate fechadistribuida;
private int unidadesrepartidas;
private Tipodieta tipodieta;

public Menu(int id, String nombre, double consumocalorico, double precioventamenu, double preciocostemenu,
		boolean frutossecos, LocalDate fechadistribuida, int unidadesrepartidas, Tipodieta tipodieta) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.consumocalorico = consumocalorico;
	setPrecioventamenu( precioventamenu);
	this.precioventamenu = precioventamenu;
	setPreciocostemenu( preciocostemenu);
	this.preciocostemenu = preciocostemenu;
	this.frutossecos = frutossecos;
	this.fechadistribuida = fechadistribuida;
	this.unidadesrepartidas = unidadesrepartidas;
	this.tipodieta = tipodieta;
}
protected int getId() {
	return id;
}
protected void setId(int id) {
	this.id = id;
}
protected String getNombre() {
	return nombre;
}
protected void setNombre(String nombre) {
	this.nombre = nombre;
}
protected double getConsumocalorico() {
	return consumocalorico;
}
protected void setConsumocalorico(double consumocalorico) {
	this.consumocalorico = consumocalorico;
}
protected double getPrecioventamenu() {
	return precioventamenu;
}
protected void setPrecioventamenu(double precioventamenu) {
	if(precioventamenu<preciocostemenu*130/100 || precioventamenu<0) {
		System.out.println("NO ES RENTABLE, MINIMO +30%");
	}
	else {
	this.precioventamenu = precioventamenu;
	}
}
protected double getPreciocostemenu() {
	return preciocostemenu;
}
protected void setPreciocostemenu(double preciocostemenu) {
	if(preciocostemenu<0) {
		System.out.println("ERROR:NO PUEDE SER NEGATIVO");
	}
	else {
	this.preciocostemenu = preciocostemenu;
	}
}
protected Tipodieta getTipodieta() {
	return tipodieta;
}
protected void setTipodieta(Tipodieta tipodieta) {
	this.tipodieta = tipodieta;
	
}

protected boolean isFrutossecos() {
	return frutossecos;
}
protected void setFrutossecos(boolean frutossecos) {
	this.frutossecos = frutossecos;
}
protected LocalDate getFechadistribuida() {
	return fechadistribuida;
}
protected void setFechadistribuida(LocalDate fechadistribuida) {
	this.fechadistribuida = fechadistribuida;
}
protected int getUnidadesrepartidas() {
	return unidadesrepartidas;
}
protected void setUnidadesrepartidas(int unidadesrepartidas) {
	this.unidadesrepartidas = unidadesrepartidas;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Menu other = (Menu) obj;
	return Double.doubleToLongBits(consumocalorico) == Double.doubleToLongBits(other.consumocalorico) && id == other.id
			&& Objects.equals(nombre, other.nombre)
			&& Double.doubleToLongBits(preciocostemenu) == Double.doubleToLongBits(other.preciocostemenu)
			&& Double.doubleToLongBits(precioventamenu) == Double.doubleToLongBits(other.precioventamenu)
			&& tipodieta == other.tipodieta;
}

public boolean esbajaencalorias() {
	return consumocalorico<1000;
}
public boolean contienecarne() {
	boolean contiene=false;
	if(!tipodieta.equals(Tipodieta.VEGETARIANO)||!tipodieta.equals(Tipodieta.VEGANO)){
		contiene=true;
		
	}
	return contiene;
}
@Override
public String toString() {
	return "Menu:" + nombre + "Tipo:" + tipodieta + "precio venta" + precioventamenu + "euros, fecha " + fechadistribuida ;
}

}
