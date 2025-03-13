package Modelo;

public class RobotSoldador extends Robots {

	private int temperaturatrabaja;
	private String especificacionseguridad;
	
	
	
	
	@Override
	public String ejecutartarea() {
		return "Solda piezas";
	}

	@Override
	public boolean recargar() {
		return false;
	}

	
	
	
}
