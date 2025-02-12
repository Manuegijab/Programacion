package RPG;

public class Personaje {
private String nombre;
private int nivel;
private int hp;
private String arma= getArma();

protected String getArma () {
	;
	
    if (this instanceof Caballero) {
    	arma= "Espada";
    } else if (this instanceof Arquero) {
    	arma= "Flecha";
    } else if (this instanceof Mago) {
    	arma="Hechizo";
    } else {
    	;
    }
    return arma;
}

protected boolean esatacado(Personaje atacante) {
	boolean ataca=true;
	if(this instanceof Caballero || this instanceof Arquero) {
		if(atacante instanceof Mago) {
			
		}
		else {
			ataca=false;
		}
		
	}
	if(this instanceof Mago) {
		ataca=false;
	}
	if(this instanceof Villano) {
		
	}
	return ataca;
}

protected boolean esatacado(Personaje atacante, int distancia) {
	boolean ataca=true;
	if(this instanceof Caballero || this instanceof Arquero && atacante instanceof Mago) {
		
		 ataca=true;
		}
	if(this instanceof Caballero && atacante instanceof Arquero && distancia < 50) {
		ataca=false;
		
	}
	if(this instanceof Arquero  && atacante instanceof Caballero && distancia < 100) {
		ataca=false;
		
	}
	
	if(this instanceof Mago) {
		ataca=false;
	}
	if(this instanceof Villano) {
		
	}
	return ataca;
}
}

