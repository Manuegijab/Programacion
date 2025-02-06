package Pruebas;

public class Arbolnavidad {
	public static void main(String[] args) {
		int i;
		int j;
		int z;
		String cadena ="";
		String espacio=" ";
		for(i=1; i<=3 ;i++) {
		if (i!=3) {
		
		cadena=cadena+espacio;
		
		}
		else{
			
			cadena=cadena+"*";
			

		}
	}
		String cadena2="";
		for (j=1; j<=4;j++) {
		
		if (j==3 | j==1) {
			cadena2=cadena2+" ";
			}
			else{
				cadena2=cadena2+"*";
			}
		}
		String cadena3="";
		for (z=1; z<=5 ; z++) {
		
		if (z==1 | z==5 ) {
			cadena3=cadena3+"*";
			}
			else{
				cadena3=cadena3+" ";
			}
		}
		System.out.println(cadena);
		System.out.println(cadena2);
		System.out.println(cadena3);
		System.out.println("_| |_");
	}

}
