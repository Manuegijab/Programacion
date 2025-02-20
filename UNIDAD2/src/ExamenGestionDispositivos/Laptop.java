package ExamenGestionDispositivos;

public class Laptop extends Computadora {

	private double peso;

	public Laptop(String marca, String modelo, double precio, int capacidadRAM, double peso) {
		super(marca, modelo, precio, capacidadRAM);
		this.peso = peso;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double calcularPrecioDescuento() {
		double descuento = 0;
		if (peso>2) {
			descuento= this.getPrecio()*20/100;
		}
		else {
			descuento= this.getPrecio()*12/100;

			
		}
		 double preciodescuento = this.getPrecio()-descuento;
		 return preciodescuento;
	}
}

