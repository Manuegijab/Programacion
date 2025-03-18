package Modelo;

import java.util.InputMismatchException;

public class generaExcepcion {
	
	public void generaIOException() throws InputMismatchException{
		try {
		throw new InputMismatchException();
		}
		catch (InputMismatchException e ) {
			throw e;
		}
	}
		
	
}
