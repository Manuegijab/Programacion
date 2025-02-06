package Paquete2;

public class Animal {
public String tipo;
public String nombre;
private int edad;

 public boolean caminar () {
	return true;
}
 private void comer() {
	
	System.out.println("Estoy comiendo");
}
 
 public void dardeComer() {
	 if(tipo.equals("perro")) {
		 comer();
	 }
	 else {
		 System.out.println("No te toca comer");
	 }
 }
 public boolean sondelmismotipo(Animal a1, Animal a2) {
	 boolean son=false;
	 son=tipo.equals(a1.tipo) && tipo.equals(a2.tipo);
	 return son;
 }

}
