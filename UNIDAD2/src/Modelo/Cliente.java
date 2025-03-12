package Modelo;

public class Cliente implements Accion {

	@Override
	public String ejecutaaccion() {
		// TODO Auto-generated method stub
		return "Cliente que compra";
	}

	@Override
	public String toString() {
		return ejecutaaccion();
	}

}
