package ExamenGestionDispositivos;

import Herencia.Profesor;
import Herencia.Profesorinterino;

public class GestionaDispositivos {
public static void main(String[] args) {
	
	Smartphone s1= new Smartphone("Samsumg", "S21", 900, false, 2);
	Laptop l1= new Laptop ("Lenovo", "C32", 1200, 32, 3);
	Laptop l1pruebaset= new Laptop ("Lenovo", "C32", -2, 32, 3);
	PcSobremesa p1= new PcSobremesa("Asus", "K87", 1400, 64, true);
	Dispositivo s2= new Smartphone("Samsumg", "S21", 900, false, 2);
	Dispositivo l2= new Laptop ("PcCom", "C32", 1200, 32, 3);
	Dispositivo p3= new PcSobremesa ("Nvidia", "K87", 1400, 64, true);
	
	System.out.println(l1pruebaset);
	System.out.println(s1);
	System.out.println(p3);
	System.out.println(s1.equals(s2));
	System.out.println(p1.equals(p3));
	
	System.out.println(s1 instanceof Smartphone);
	System.out.println(s2 instanceof Smartphone);
	
	Smartphone s2cast =(Smartphone)s2;
	Laptop l2cast =(Laptop)l2;
	PcSobremesa p3cast =(PcSobremesa)p3;
	
	System.out.println(s2cast.getCantidadCamaras());
	System.out.println(l2cast.getPeso());
	System.out.println(p3cast.isTieneGPUdedicada());
}
	
	
}
