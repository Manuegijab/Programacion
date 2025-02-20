package ExamenGestionDispositivos;

public class Computadora extends Dispositivo {
	
private int capacidadRAM;

public Computadora(String marca, String modelo, double precio, int capacidadRAM) {
	super(marca, modelo, precio);
	this.capacidadRAM = capacidadRAM;
}

protected int getCapacidadRAM() {
	return capacidadRAM;
}

protected void setCapacidadRAM(int capacidadRAM) {
	this.capacidadRAM = capacidadRAM;
}


}
