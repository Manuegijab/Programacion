package Enum;

public class Reserva {

	private enum Mes{
		ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE;
	}
	
	Mes mes= Mes.ENERO;
	
	Mes mes2= mes.valueOf("VERANO");
			
			public static void main(String[] args) {
				Mes mes2= Mes.valueOf("VERANO");

				System.out.println(mes2);
			}
}
