package OrientaciónAObjetos;

import Paquete2.Animal;

public class GestionaAnimales {

	public static void main(String[] args) {
	Animal perro= new Animal();
	
	//perro.edad; NO visible porque private
	perro.nombre="Pablo" ;
	perro.tipo="perro";//Funciona
	//perro.tipo; NO visible porque tiene visibilidad por defecto y está en otro paquete
	
	boolean anda= perro.caminar();
	System.out.println(anda);
	
	perro.dardeComer();
	
	Animal gato= new Animal();
	gato.tipo="gato";
	gato.nombre="Boni";
	gato.dardeComer();
	
	boolean mismotipo= perro.sondelmismotipo(perro,gato);
	System.out.println(mismotipo);

			}

}
