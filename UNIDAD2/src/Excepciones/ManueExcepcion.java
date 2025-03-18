package Excepciones;

import java.util.Arrays;

public class ManueExcepcion extends Exception{
	

	public ManueExcepcion(String mensaje) {
		super(mensaje);
	}

	@Override
	public String toString() {
		return "ManueExcepcion [getMessage()=" + getMessage() + ", getLocalizedMessage()=" + getLocalizedMessage()
				+ ", getCause()=" + getCause() + ", toString()=" + super.toString() + ", fillInStackTrace()="
				+ fillInStackTrace() + ", getStackTrace()=" + Arrays.toString(getStackTrace()) + ", getSuppressed()="
				+ Arrays.toString(getSuppressed()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	
}
