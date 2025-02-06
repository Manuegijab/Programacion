package Boletinpython;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Scanner calculadora= new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero1=calculadora.nextInt();
		System.out.println("Dime otro numero");
		int numero2=calculadora.nextInt();
		System.out.println("Que operacion quieres hacer?(+,-,*,/)");
		String operador=calculadora.next();
		
		switch (operador){
		case "+":
			System.out.println(numero1+numero2);
			break;
		case "-":
			System.out.println(numero1-numero2);
			break;
		case "*":
			System.out.println(numero1*numero2);
			break;
		case "/":
			System.out.println(numero1/numero2);
			break;
		}
	}

}
