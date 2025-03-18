package Controlador;

import Modelo.*;
import java.time.LocalDate;


public class GestionaPagos {
	 public static void main(String[] args) {
	        Tienda tienda = new Tienda(LocalDate.of(2025, 03, 15));
	        
	        Pago pago1 = new Pago(Divisa.EURO, 0);
	        Pago pago2 = new Pago(Divisa.DOLLAR, 0);

	        pago1.actualizarEstado(EstadoPago.PAGADO);
	        pago2.actualizarEstado(EstadoPago.ERROR);

	        tienda.agregarPagos(pago1);;
	        tienda.agregarPagos(pago2);
	        pago1.toString();
	        tienda.imprimeResumenDia();
	    }
}
