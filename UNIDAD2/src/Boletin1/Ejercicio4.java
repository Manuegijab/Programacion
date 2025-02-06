package Boletin1;
import java.util.Scanner;
public class Ejercicio4 {
public static void main(String[] args) {
	Scanner ingresar =new Scanner(System.in);
	System.out.print("Ingrese usuario:");
	String usuario=ingresar.next();
	System.out.print("Ingresa tu contraseña");
	String contrasena=ingresar.next();
	
	if(usuario!="admin" && contrasena!= "secreta123"){
		System.out.println("Estas dentro");
	}
	else{
		System.out.println("Usuario o contraseña inválido");
	}
	
	
}
}
