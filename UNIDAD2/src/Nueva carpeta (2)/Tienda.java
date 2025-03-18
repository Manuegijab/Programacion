package Modelo;

import java.time.LocalDate;

public class Tienda {
private LocalDate fecha;
private Pago [] pagos;
private int contadorPagos;

public Tienda(LocalDate fecha) {
	super();
	this.fecha = fecha;
	this.pagos = new Pago[100];
	this.contadorPagos=0;
}
	public void agregarPagos (Pago pago) {
		if (contadorPagos <100) {
			pagos[contadorPagos++]=pago;
		}
	}
	
	public void imprimeResumenDia() {
		System.out.println("Resumen de pagos del dia"+ fecha + ":");
		for (int i =0; i<contadorPagos; i++) {
			System.out.println(pagos[i].toString());
		}
	}
}



