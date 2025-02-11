package Boletin3OO;

public class Cocheelectrico extends Vehiculo{

	private String tipobateria;

	public Cocheelectrico(String dueno, int numpuertas, int numruedas, String tipobateria) {
		super(dueno, numpuertas, numruedas);
		this.tipobateria = tipobateria;
	}

	public String getTipobateria() {
		return tipobateria;
	}

	public void setTipobateria(String tipobateria) {
		if(tipobateria.equals("LFP") || tipobateria.equals("NCM")) {
		this.tipobateria = tipobateria;
	}
	}
 }











