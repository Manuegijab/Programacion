package models;


public class Maestro {
    private String nombre;
    private String apellidos;
    private String dni;
    private String grupoTutor;

    public Maestro(String nombre, String apellidos, String dni, String grupoTutor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.grupoTutor = grupoTutor;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGrupoTutor() {
		return grupoTutor;
	}

	public void setGrupoTutor(String grupoTutor) {
		this.grupoTutor = grupoTutor;
	}

}
