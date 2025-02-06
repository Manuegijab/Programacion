package OrientaciónAObjetos;

public class Producto {
String nombre;
int numunidades;
float precioventa;

boolean hayquepedirstock() {
	boolean pedir=false;
	
	if (numunidades <5) {
		pedir=true;
	}
	else {
		pedir=false;
	}
	return pedir;
}
 int aumentaunidades(int aumento) {
	 
	 numunidades= numunidades+aumento;
	 
	 return numunidades;
 }
 
 String pasaacadena () {
	 String cadenaproducto= "Producto: "+nombre+" tiene "+numunidades+" que vale "+precioventa;
	 return cadenaproducto;
	 
 }
}
