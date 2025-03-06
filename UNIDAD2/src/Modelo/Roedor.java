package Modelo;

public class Roedor extends Animal {

	@Override
	public boolean atacar(Animal a1) {
		return false ;
	}

	@Override
	public boolean huir(Animal a1) {
		return a1 instanceof Serpiente;
	}

}
