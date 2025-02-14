package FutureCars;

public class Gestionacoche {
public static void main(String[] args) {
	Conductor c1= new Conductor("Eva", 3);
	System.out.println(c1.toString());
	
	Sensor s1= new Sensor(12.3, -11.3);
	System.out.println(s1.toString());
}
}
