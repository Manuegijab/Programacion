package ExamenGestionDispositivos;

public class Smartphone extends Telefono{

	private int cantidadCamaras;

	public Smartphone(String marca, String modelo, double precio, boolean tieneTecladoFisico, int cantidadCamaras) {
		super(marca, modelo, precio, tieneTecladoFisico);
		this.cantidadCamaras = cantidadCamaras;
	}

	protected int getCantidadCamaras() {
		return cantidadCamaras;
	}

	protected void setCantidadCamaras(int cantidadCamaras) {
		this.cantidadCamaras = cantidadCamaras;
	}
	
	@Override
	public double calcularPrecioDescuento() {
		
		double descuento= this.getPrecio()*15/100;
		return this.getPrecio()-descuento;
	}
}
