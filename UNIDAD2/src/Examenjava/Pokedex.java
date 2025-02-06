package Examenjava;

import java.util.Random;
import java.util.Scanner;
//Primero creamos el menú con las distintas opciones que va a teneer nuestro programa, una funcion de capturar pokemon, donde se dividirá en 2, obtener nombre pokemon y nivel inicial. Otra funcion de realizar batalla, que se divirá en varias funciones, una que nosotros eligamos el pokemon mediante la posición, otra que el sistema devolverá aleatoriamente un pokemon, otra que calculará el resultado de las batallas dependinendo del nivel y por ultimo que muestre el resultado en un formato. Por otro lado, otra opción es mostrar la pokedex, donde mostrará el nombre y nivel del pokemon. Por ultimo una funcion llamada finalizar que mostrará un mensaje que contendrá los pokemons del equipo, el nivel medio y las batallas realizadas.
public class Pokedex {
public static void main(String[] args) {
	 Scanner sc= new Scanner (System.in);

	Pokedex f=new Pokedex();
	String opcion= f.imprimemenu();
	String[]nombrespokemons= new String[15];
	int[] nivelespokemons= new int [15];
	int posicionpokemon=0;
	int batallas=0;

	


	while(opcion!="F") {

		switch(opcion) {

		case "C":{
			
			nombrespokemons=f.nombrepokemon(posicionpokemon);
			nivelespokemons=f.nivelinicial(posicionpokemon);
			 f.imprimemenu();
			 posicionpokemon++;
			break;

			

		}

		case "B": {

			 System.out.println("Dime que pokemon quieres elegir (Su posicion)");
			 int posicionpokemonelegir= sc.nextInt();
			 String pokemonelegido=f.elegirnombrepokemon(nombrespokemons,posicionpokemonelegir);
			 int nivelpokemonelegido=f.niveldepokemonelegido(nivelespokemons, posicionpokemonelegir);
			 int nivelpokemonrandom=f.niveldepokemonrandom(nivelespokemons,posicionpokemon);
			 String pokemonrandom=f.nombrepokemonrandom(nombrespokemons,nivelpokemonrandom);
			 if(nivelpokemonelegido!=nivelpokemonrandom) {
				 
				 if (nivelpokemonelegido>nivelpokemonrandom){
				 String resultado= f.pokemonmasfuertequerandom(pokemonelegido,nivelpokemonelegido,nivelpokemonrandom,pokemonrandom);
				 System.out.println(resultado);
					 
				 
				 }
				 else if (nivelpokemonelegido<nivelpokemonrandom) {
					 String resultado=f.pokemonmenosfuertequerandom(pokemonelegido,nivelpokemonelegido,nivelpokemonrandom,pokemonrandom);
					 System.out.println(resultado);
				 }
				 else {
					 System.out.println("Empate");
				 }
			 }
			batallas++;
			 f.imprimemenu();
			break;

		}

		case "P":{
			
		String[]pokedex=f.pokedex(nivelespokemons, nombrespokemons, posicionpokemon);
		System.out.println(pokedex);
		 f.imprimemenu();


			break;

		}

		

		

		default:{

			System.out.println("No válido");

			f.imprimemenu();

			

		}

		}
		if(opcion=="F") {
			String finalizar= f.finalizar(posicionpokemon,nivelespokemons,batallas);
			System.out.println(finalizar);
		}
		

	}





}

 String imprimemenu() {

	Pokedex f=new Pokedex();

	Scanner sc=new Scanner(System.in);

	System.out.println("Capturar pokemon C");

	System.out.println("Realizar batalla B");

	System.out.println("Mostrar pokedex P");

	System.out.println("Finalizar F");






	String opcion=sc.next();

	return opcion;

}
 
 String[] nombrepokemon (int posicionpokemon) {
	 String[]nombrespokemons= new String [15];
	 Scanner sc= new Scanner (System.in);
	 System.out.println("Dime el nombre del pokemon");
	 String nombrepokemonaañadir= sc.next();
	 nombrespokemons[posicionpokemon]=nombrepokemonaañadir;
	 return nombrespokemons;
 }
 
 int [] nivelinicial (int posicionpokemon) {
	 int[]nivelespokemons= new int [15];
	 Scanner sc= new Scanner (System.in);
	 System.out.println("Dime el nivel del pokemon");
	 int nivelpokemonaañadir= sc.nextInt();
	 nivelespokemons[posicionpokemon]=nivelpokemonaañadir;
	 return nivelespokemons;
 }
 
 String elegirnombrepokemon(String[]nombrespokemon, int posicionpokemonelegir) {
	 Scanner sc= new Scanner (System.in);
	String pokemonelegido=nombrespokemon[posicionpokemonelegir];
	return pokemonelegido;

 }
 
 int niveldepokemonrandom(int[] nivelespokemons, int posicionpokemon) {
	 Random randomnumber=new Random(posicionpokemon);
	int nivelpokemonrandom= randomnumber.nextInt();
	int nivelpokemonelegido=nivelespokemons[nivelpokemonrandom];
	 return nivelpokemonelegido;
 }
 String nombrepokemonrandom(String[]nombrespokemon, int nivelpokemonrandom) {
	Scanner sc= new Scanner (System.in);
	String pokemonelegido=nombrespokemon[nivelpokemonrandom];
	return pokemonelegido;

 }
 
 int niveldepokemonelegido(int[] nivelespokemons, int posicionpokemonelegir) {
	 
	 int nivelpokemonelegido=nivelespokemons[posicionpokemonelegir];
	 return nivelpokemonelegido;
 }
 
 String pokemonmasfuertequerandom(String pokemonelegido, int nivelpokemonelegido, int nivelpokemonrandom, String pokemonrandom) {
	 nivelpokemonelegido++;
	 String resultado= "Tu pokemon"+ pokemonelegido+"Nivel"+nivelpokemonelegido+"luchó contra"+pokemonrandom+"de nivel"+nivelpokemonrandom+"resultado:Ganaste";
	 return resultado;
 }
 
 String pokemonmenosfuertequerandom(String pokemonelegido, int nivelpokemonelegido, int nivelpokemonrandom, String pokemonrandom) {
	 String resultado= "Tu pokemon"+ pokemonelegido+"Nivel"+nivelpokemonelegido+"luchó contra"+pokemonrandom+"de nivel"+nivelpokemonrandom+"resultado:Perdiste";
	 return resultado;
 }
 
 String[] pokedex(int[]nivelespokemons ,String []nombrespokemons, int posicionpokemonelegir) {
	 String recogerdatos="";
	 String[]pokedex= new String[posicionpokemonelegir];
	 for (int i=0;i<posicionpokemonelegir;i++) {
	 recogerdatos= posicionpokemonelegir+nombrespokemons[posicionpokemonelegir]+"nivel"+nivelespokemons[posicionpokemonelegir];
	 pokedex[posicionpokemonelegir]=recogerdatos;
	 }
	 return pokedex;
	 
 }
 
 String finalizar ( int posicionpokemonelegir, int[]nivelespokemons, int batalla) {
	 int nivelmedio=0;
	 String recuentopokemons="";
	 for (int i=0;i<nivelespokemons.length;i++) {
		 int nivel=nivelespokemons[i];
		 nivelmedio= nivelmedio+nivel;
		 
	 }
	 
	 nivelmedio= nivelmedio/nivelespokemons.length;
	  recuentopokemons= "Tu equipo tiene"+ nivelespokemons.length+"pokemons. Su nivel medio es "+nivelmedio+". Han realizado"+batalla+"batallas hasta ahora.";
	 return recuentopokemons;
 }
 
 
 
}
