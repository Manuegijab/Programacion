package OrientaciónAObjetos;

public class Gestionaproducto {
public static void main(String[] args) {
	Producto Napolitanas= new Producto();
	int aumento= 5;
	Napolitanas.nombre="Napolitanas";
	Napolitanas.numunidades= 6;
	Napolitanas.precioventa= (float) 0.90;
	
	boolean stocknapolitanas= Napolitanas.hayquepedirstock();
	System.out.println("Hay que pedir stock? "+ stocknapolitanas );
	
	if(stocknapolitanas) {
		int aumentonapolitanas= Napolitanas.aumentaunidades(aumento);
		System.out.println(aumentonapolitanas);

		
	}
	String cadenanapolitanas= Napolitanas.pasaacadena();
	System.out.println(cadenanapolitanas);

Producto Pizza= new Producto();
	
Pizza.nombre="Pizza";
Pizza.numunidades= 4;
Pizza.precioventa= (float) 2.20;
	
	boolean stockpizza= Pizza.hayquepedirstock();
	System.out.println("Hay que pedir stock? "+ stockpizza );
	
	if(stockpizza==true) {
		int aumentonapizza= Pizza.aumentaunidades(aumento);

		
	}
	String cadenapizza= Pizza.pasaacadena();
	System.out.println(cadenapizza);
}
}
