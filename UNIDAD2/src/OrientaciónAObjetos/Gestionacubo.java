package OrientaciónAObjetos;

public class Gestionacubo {
	public static void main(String[] args) {
		Cubo cubo1= new Cubo(4, 0);
		float areacubo1= cubo1.calculaarea();
		System.out.println(areacubo1);
		System.out.println(cubo1.capacidadmax);
		
		boolean puedellenar=cubo1.rellenar(6);
		boolean puedevaciar=cubo1.vaciarcubo(4);
		boolean puedevaciar2=cubo1.vaciarcubo(3);
		boolean puedellenar2=cubo1.rellenar(16);

		System.out.println(puedellenar);
		System.out.println(puedevaciar);
		System.out.println(puedevaciar2);
		System.out.println(puedellenar2);

		
	}

}
