package Modelo;

public class Serpiente extends Animal {

	@Override
	public boolean atacar(Animal a1) {
		return a1 instanceof Roedor;
	}

	@Override
	public boolean huir(Animal a1) {
		return false;
	}

	
	
}
