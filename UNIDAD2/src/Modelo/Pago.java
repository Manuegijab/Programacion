package Modelo;

public class Pago implements IPago {
private Divisa divisa;
private double cantidad;
private EstadoPago estado;


public Pago(Divisa divisa, double cantidad) {
    this.divisa = divisa;
    this.cantidad = cantidad;
    this.estado = EstadoPago.PENDIENTE;
}

public void actualizarEstado(EstadoPago nuevoEstado) {
	if(validarMetodoPago() && realizarPago()) {
    this.estado = nuevoEstado;}
	else {
		System.out.println("ERROR");
	}
	
}

public String toString() {
    return "Cantidad: " + cantidad + " " + divisa + " Estado: " + estado;
}

@Override
public boolean validarMetodoPago() {
	boolean valido=true;
	if(divisa.equals(Divisa.DOLLAR) || divisa.equals(Divisa.EURO) && cantidad>1) {
		
	}
	else {
	valido= false;
	}
	return valido;
}

@Override
public boolean realizarPago() {
	
	return validarMetodoPago() ;
}
}
