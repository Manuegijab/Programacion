package OrientaciónAObjetos;

public class GestionaPokemon {
public static void main(String[] args) {
	PokemonObjetos pikachu= new PokemonObjetos();
	pikachu.nombre="Pikachu";
	pikachu.nivel=12;
	pikachu.tipo="Eléctrico";
	
	PokemonObjetos mew= new PokemonObjetos();
	mew.nombre="Mew";
	mew.nivel=20;
	mew.tipo="Psíquico";
	
	boolean gana= pikachu.luchar(mew);
	System.out.println("Pikachu gana a Mew?" + gana);
	
	String cadenapikachu= pikachu.convierteEnCadena();
	String cadenamew=mew.convierteEnCadena();
	
	System.out.println(cadenapikachu);
	System.out.println(cadenamew);
}
}
