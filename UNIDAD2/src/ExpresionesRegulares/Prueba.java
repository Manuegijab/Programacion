package ExpresionesRegulares;

public class Prueba {
public static void main(String[] args) {
	String s1= new String ("h429");
	String s2=new String ("17219");
	String s3=new String ("12345678A");
	String s4=new String ("A");

	
	System.out.println(s2.matches("\\d*"));
	System.out.println(s2.matches("[0-9]"));
	System.out.println(s4.matches("\\d{8}\\z[A-Za-z}]"));
	System.out.println(s3.matches("\\d{8}[A-Za-z]{1}"));


}

}
