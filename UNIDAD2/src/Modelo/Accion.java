package Modelo;

public interface Accion {
	String ejecutaaccion();
}

// agregar en lista
for (int i = 0; i < pruebas.length; i++) {
    if (p != null && p.equals(pruebas[i]) || (p != null && p.getEstadoPrueba().equals(Estado.PLANIFICADA)
            && p.getFecha().isBefore(LocalDate.now()))) {
        throw new CompeticionExcepcion(
                "No puedes añadir una prueba repetida ni con fecha pasada siendo planificada");

        
        public Prueba getpruebaCercana() {

            Prueba pruebaCercana = pruebas[0];

            for (int i = 0; i < pruebas.length; i++) {
                if (pruebaCercana != null && pruebas[i] != null && pruebas[i].equals(Estado.PLANIFICADA)) {
                    int diasMinimo = pruebaCercana.getFecha().compareTo(LocalDate.now());
                    Prueba itero = pruebas[i];
                    // para saber cuantos dias hay de la fecha actual a la de la prueba
                    int diasItero = itero.getFecha().compareTo(LocalDate.now());
                    if (diasMinimo > diasItero) {
                        pruebaCercana = itero;
                    }
                }

            }
            return pruebaCercana;

        }
    }