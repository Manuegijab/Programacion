package Modelo;

import java.time.LocalDate;

public abstract class Animal{
	private String nombreespecie;
	private TipoFamilia tipofamilia;
	private String habita;
	private Animal[] animalesquecome;
	private Animal[] animalesporlosqueescomido;
	
	
	abstract boolean atacar(Animal a1);
		
	abstract boolean huir(Animal a1);
		
	
}