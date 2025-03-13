package Modelo;

public class AvesRapaces extends Animal {

	
	@Override
	public boolean atacar(Animal a1) {
		return a1 instanceof Serpiente || a1 instanceof Roedor;
	}

	@Override
	public boolean huir(Animal a1) {
		return a1 instanceof Leon ;
	}


	
	
}
