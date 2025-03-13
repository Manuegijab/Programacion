package Modelo;

public class PersonaRefactoriza {
	    String nombre;
	    Accion [] acciones;

	    public void identificarse() {
	        System.out.println("Soy una persona y me llamo " + nombre);
	    }

		public PersonaRefactoriza() {
			super();
			this.acciones= new Accion[10];
		}

		public PersonaRefactoriza(String nombre) {
			super();
			this.nombre = nombre;
			this.acciones = acciones;
		}

		public String getNombre() {
			return nombre;
		}

		protected void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Accion[] getAcciones() {
			return acciones;
		}

		public void setAcciones(Accion[] acciones) {
			this.acciones = acciones;
		}

	
		}

	

