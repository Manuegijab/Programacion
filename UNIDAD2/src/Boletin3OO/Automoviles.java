package Boletin3OO;

public class Automoviles extends Vehiculo {
    private String calificacinEcologica;

    // Constructor
    public Automoviles(String dueno, int numpuertas, int numruedas, String calificacinEcologica) {
        super(dueno, numpuertas, numruedas);  // Llamar al constructor de la clase base
        this.calificacinEcologica = calificacinEcologica;
    }

    // Getter y setter
    public String getCalificacinEcologica() {
        return calificacinEcologica;
    }

    public void setCalificacinEcologica(String calificacinEcologica) {
        this.calificacinEcologica = calificacinEcologica;
    }

    @Override
    public String toString() {
        return super.toString() + ", calificacinEcologica=" + calificacinEcologica + "]";
    }

    // Implementación de la lógica específica
    @Override
    public boolean tienelicenciaparacircular(String ciudad) {
        // Implementa lógica específica si es necesario
        return false;  // Ejemplo básico
    }
}