package SimulacroOrientacion;

import java.util.Objects;

public class Empleado {
	String nombre;
	String DNI;
	int salarioBase;
	public Empleado(String nombre, String dNI, int salariobase) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		salarioBase = salariobase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getSalariobase() {
		return salarioBase;
	}
	public void setSalariobase(int salariobase) {
		salarioBase = salariobase;
	}
	@Override
	public String toString() {
		return "DNI=" + DNI + "- Nombre=" + nombre + "- Salariobase=" + salarioBase;
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI, salarioBase, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(DNI, other.DNI);
	}
	
	boolean validaSalarioBase () {
		boolean salario = true;
		if (salario) {
			System.out.println("Error, el salario nunca puede ser menor que 0.");
			salario = false;
		}
		return salario;
	}
	int calculaSalario () {
		return salarioBase;
	}
}
