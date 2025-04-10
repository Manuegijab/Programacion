package Modelo;


import java.time.LocalDate;
import java.util.Objects;

public class Rematriculacion {
	
	private String bastidor;
	private String matriculaInicial;
	private String matriculaFinal;
	private LocalDate fechaMatricula;
	
	public Rematriculacion(String bastidor, String matriculaInicial, String matriculaFinal, LocalDate fechaMatricula) {
		super();
		this.bastidor = bastidor;
		this.matriculaInicial = matriculaInicial;
		this.matriculaFinal = matriculaFinal;
		this.fechaMatricula = fechaMatricula;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getMatriculaInicial() {
		return matriculaInicial;
	}

	public void setMatriculaInicial(String matriculaInicial) {
		this.matriculaInicial = matriculaInicial;
	}

	public String getMatriculaFinal() {
		return matriculaFinal;
	}

	public void setMatriculaFinal(String matriculaFinal) {
		this.matriculaFinal = matriculaFinal;
	}

	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDate fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rematriculacion other = (Rematriculacion) obj;
		return Objects.equals(fechaMatricula, other.fechaMatricula);
	}

	@Override
	public String toString() {
		return "Rematriculacion [bastidor=" + bastidor + ", matriculaInicial=" + matriculaInicial + ", matriculaFinal="
				+ matriculaFinal + ", fechaMatricula=" + fechaMatricula + "]";
	}
	
	

}
