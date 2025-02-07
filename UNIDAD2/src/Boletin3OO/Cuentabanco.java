package Boletin3OO;

public class Cuentabanco {
private double saldo;
private String numerocuenta;
private Persona titulardelacuenta;
private Persona autorizado;
public Cuentabanco(double saldo, String numerocuenta, Persona titulardelacuenta) {
	super();
	this.saldo = saldo;
	this.numerocuenta = numerocuenta;
	this.titulardelacuenta = titulardelacuenta;
//	this.autorizado = autorizado;
}

private boolean validacionimportepositivo(double importe) {
	return importe > 0;
}
private boolean validaAutorizado (String dni) {
	return  dni !=null && dni.equals(autorizado.getDni());
	
}
public void ingresardinero(Persona personaGestion, double ingreso) {
	if(validaAutorizado(personaGestion.getDni()) && validacionimportepositivo(ingreso)) {
		setSaldo(getSaldo()+ingreso);
	}
	else {
		System.out.println("ERROR");
	}
}
public void retiradaDinero(Persona personaGestion, double reintegro) {
	if (validaAutorizado(personaGestion.getDni()) && validacionimportepositivo(reintegro) && getSaldo()>= reintegro) {
		setSaldo(getSaldo()-reintegro);
		
	}
	else {
		System.out.println("ERROR");
	}

}

public void eliminarAutorizado(String dni) {
	if (validaAutorizado(dni)) {
		autorizado=null;
	}
	else {
		System.out.println("ERROR");
	}
}

public double getSaldo() {
	return saldo;
}
private void setSaldo(double saldo) {
	this.saldo = saldo;
}
public String getNumerocuenta() {
	return numerocuenta;
}
public void setNumerocuenta(String numerocuenta) {
	this.numerocuenta = numerocuenta;
}
public Persona getTitulardelacuenta() {
	return titulardelacuenta;
}
public void setTitulardelacuenta(Persona titulardelacuenta) {
	this.titulardelacuenta = titulardelacuenta;
}
public Persona getAutorizado() {
	return autorizado;
}
public void setAutorizado(Persona autorizado) {
	this.autorizado = autorizado;
}

@Override
public String toString() {
	return "Cuentabanco [saldo=" + saldo + ", numerocuenta=" + numerocuenta + ", titulardelacuenta=" + titulardelacuenta
			+ ", autorizado=" + autorizado + "]";
}


}