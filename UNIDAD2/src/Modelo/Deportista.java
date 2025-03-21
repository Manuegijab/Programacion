package Modelo;

import java.time.LocalDate;
import java.util.Arrays;

public abstract class Deportista implements ICompeticion {
String nombre;
String pais;
int edad;
double peso;
double altura;
Prueba[] pruebas;
 


	public Deportista(String nombre, String pais, int edad, double peso, double altura) {
	super();
	this.nombre = nombre;
	this.pais = pais;
	this.edad = edad;
	this.peso = peso;
	this.altura = altura;
	this.pruebas = new Prueba[50];
}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public Prueba[] getPruebas() {
		return pruebas;
	}


	public void setPruebas(Prueba[] pruebas) {
		this.pruebas = pruebas;
	}


	abstract int getTiempoCalentamiento();
	public int gethoraentrenamiento(LocalDate fecha) {
		int numdias=0;
		
		
		return numdias;
		
	}
	public Prueba getpruebamascercana() {
		Prueba p =null;
		for(int i=0;i<pruebas.length;i++) {
			if (p !=null && pruebas[i].equals(EstadoPrueba.PLANIFICADA)) {
				Prueba itero= getPruebas()[i];
				int diasminimo= p.getFecha().compareTo(LocalDate.now());
				int diasitero= itero.getFecha().compareTo(LocalDate.now());
				if(diasminimo>diasitero) {
					p= itero;
				}
			}
		}
		
		return p;
		
	}
	 
	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + ", pruebas=" + Arrays.toString(pruebas) + "]";
	}


	abstract int getCaloriasNecesariasDia();
	

}
