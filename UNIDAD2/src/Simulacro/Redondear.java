                                                                                                                  package Simulacro;

public class Redondear {
public static void main(String[] args) {
	Redondear f= new Redondear();
	String numeros= f.calculaNumeroDecimales();
}


String redondear(String numeroARedondear) {
	int numeroDecimales=calculaNumeroDecimales(numeroAredondear);
	String resultado=numeroARedondear;
	if(numeroDecimales>=3) {
		//resultado=redondeoCon30MasDecimales(numeroARedondear);
	}
	else if(numeroDecimales<2) {
		resultado=redondeoCon20MenosDecimales(numeroARedondear);
	}
}

int calculaNumeroDecimales(String numeroAredondear) {
	//12.1234
	//partes[0]=12
	//partes[1]=1234
	String[]partes=numeroAredondear.split(",");
	return partes[1].length();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	}
String redondeoCon2OMenosDecimales(String numeros ) {
	int numeroDecimales=calculaNumeroDecimales(resultado);
	while(calculaNumeroDecimales!=2) {
		
	}
}

}
