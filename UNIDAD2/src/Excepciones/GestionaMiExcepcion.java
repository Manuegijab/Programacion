package Excepciones;

public class GestionaMiExcepcion {
public static void main(String[] args)  {
	
}
public void Metodo1 (int numero1) {
	try {
	if(numero1 % 2!=0) {
	throw new ManueExcepcion("Es impar");
	}
	
	}
	catch (ManueExcepcion m){
		System.out.println(m.getMessage());
		
	}
	

	}
	}


