package OrientaciónAObjetos;

public class PokemonObjetos {
	String nombre;
	int nivel;
	String tipo;
	
	String convierteEnCadena() {
		String cadena= "Pokemon : " +nombre + " Nivel: " +nivel + " Tipo: " + tipo ;
		return cadena;
	}
	
	boolean luchar(PokemonObjetos p2) {
		boolean gana= true;
		if(nivel>p2.nivel) {
			gana=true;
			nivel=nivel +1;
		}
		else {
			gana=false;
			p2.nivel=p2.nivel +1;
		}
		return gana;
	}
	public static void main(String[] args) {
	
}
}
