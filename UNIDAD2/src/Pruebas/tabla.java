package Pruebas;

public class tabla {
public static void main(String[] args) {
	
	String[] diasemana= {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
	int pos=0;
	while(  pos<diasemana.length & !diasemana[pos].equals("") ) {
		System.out.println(diasemana[pos]);
		pos++;
		}
	}
}

