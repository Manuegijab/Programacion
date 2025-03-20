package Modelo;

public abstract class Deportista implements ICompeticion {
String nombre;
String pais;
int edad;
double peso;
double altura;
Prueba[] pruebas;
 
	abstract int getTiempoCalentamiento();
	abstract int getCaloriasNecesariasDia();
	

}
