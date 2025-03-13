package Modelo;

public class Leon extends Animal {

	@Override
	public boolean atacar(Animal a1) {
		return true;
	}

	@Override
	public boolean huir(Animal a1) {
		return false;
	}

	
}
