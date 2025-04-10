package Modelo;

import java.util.Objects;

public class Nota implements Comparable{
private int nota;

public Nota(int nota) {
	super();
	this.nota = nota;
}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int hashCode() {
	return Objects.hash(nota);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Nota other = (Nota) obj;
	return nota == other.nota;
}

public int getNota() {
	return nota;
}

public void setNota(int nota) {
	this.nota = nota;
}


}
