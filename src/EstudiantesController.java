public class EstudiantesController {

    public void ordenarPorFacultad(Estudiante[] estudiantes) {
        for (int i = 1; i < estudiantes.length; i++) {
            Estudiante actual = estudiantes[i];
            int j = i - 1;
            while (j >= 0 && estudiantes[j].getCarrera().getFacultad().getNombre()
                    .compareTo(actual.getCarrera().getFacultad().getNombre()) > 0) {
                estudiantes[j + 1] = estudiantes[j];
                j--;
            }
            estudiantes[j + 1] = actual;
        }
    }

    public void ordenarPorMateriasNoAprobadas(Estudiante[] estudiantes) {
        for (int i = 1; i < estudiantes.length; i++) {
            Estudiante actual = estudiantes[i];
            int noAprobadasActual = contarNoAprobadas(actual);
            int j = i - 1; 
            while (j >= 0 && contarNoAprobadas(estudiantes[j]) < noAprobadasActual) {
                estudiantes[j + 1] = estudiantes[j];
                j--;
            }
            estudiantes[j + 1] = actual;
        }
    }

    private int contarNoAprobadas(Estudiante estudiante) {
        int contador = 0;
        for (MateriaCursada m : estudiante.getMaterias()) {
            if (!m.isAprobada()) {
                contador++;
            }
        }
        return contador;
    }
}