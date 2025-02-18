package EntornoDesarolloMANUELPARRADO;




	import java.util.Random;
	import java.util.Scanner;

	public class Ejercicio3 {
	    public static void main(String[] args) {
	        int piedra = 0;
	        int papel = 1;
	        int tijeras = 2;

	        int winhumano = 0;
	        int winmaquina = 0;

	        Random random = new Random();
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("¿Piedra, papel o tijera? ");
	        String bethumano = scanner.nextLine();

	        while (!bethumano.equals("0")) {
	            int betmaquina = random.nextInt(3);
	            System.out.print("¿Piedra, papel o tijera? ");
	            bethumano = scanner.nextLine();

	            switch (bethumano) {
	                case "piedra":
	                    if (betmaquina == piedra) {
	                        System.out.println("Empate");
	                    } else if (betmaquina == papel) {
	                        System.out.println("Gana la máquina");
	                        winmaquina++;
	                    } else if (betmaquina == tijeras) {
	                        System.out.println("Ganas tú");
	                        winhumano++;
	                    }
	                    break;

	                case "papel":
	                    if (betmaquina == papel) {
	                        System.out.println("Empate");
	                    } else if (betmaquina == piedra) {
	                        System.out.println("Ganas tú");
	                        winhumano++;
	                    } else if (betmaquina == tijeras) {
	                        System.out.println("Gana la máquina");
	                        winmaquina++;
	                    }
	                    break;
	                    
	                case "0":
	                	System.out.println("Saliendo");
	                	break;

	                case "tijera":
	                    if (betmaquina == tijeras) {
	                        System.out.println("Empate");
	                    } else if (betmaquina == piedra) {
	                        System.out.println("Gana la máquina");
	                        winmaquina++;
	                    } else if (betmaquina == papel) {
	                        System.out.println("Ganas tú");
	                        winhumano++;
	                    }
	                    break;
	                    
	                default:
	                    System.out.println("Opción no válida");
	                    break;
	            }
	        }}}

	        


