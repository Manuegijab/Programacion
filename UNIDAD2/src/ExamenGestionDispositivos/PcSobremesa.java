package ExamenGestionDispositivos;

public class PcSobremesa extends Computadora{
private boolean tieneGPUdedicada;

public PcSobremesa(String marca, String modelo, double precio, int capacidadRAM, boolean tieneGPUdedicada) {
	super(marca, modelo, precio, capacidadRAM);
	this.tieneGPUdedicada = tieneGPUdedicada;
}

protected boolean isTieneGPUdedicada() {
	return tieneGPUdedicada;
}

protected void setTieneGPUdedicada(boolean tieneGPUdedicada) {
	this.tieneGPUdedicada = tieneGPUdedicada;
}


}
