import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Crear facultad
        Facultad f1 = new Facultad("Ingenieria");
        Facultad f2 = new Facultad("Derecho");
        Facultad f3 = new Facultad("Arquitectura");
        // Crear carrera
        Carrera c1 = new Carrera("Informatica", f1);
        Carrera c2 = new Carrera("Derecho", f2);
        Carrera c3 = new Carrera("Arquitectura", f3);
        List<MateriaCursada> materias1 = new ArrayList<>();
        materias1.add(new MateriaCursada("Programacion", true));
        materias1.add(new MateriaCursada("Matematica", false));
        materias1.add(new MateriaCursada("Fisica", false));
        materias1.add(new MateriaCursada("Estructura de datos", false));
        List<MateriaCursada> materias2 = new ArrayList<>();
        materias2.add(new MateriaCursada("Fisica", false));
        materias2.add(new MateriaCursada("Estructura de datos", false));
        materias2.add(new MateriaCursada("Programacion", false));
        materias2.add(new MateriaCursada("Matemática", false));
        List<MateriaCursada> materias3 = new ArrayList<>();
        materias3.add(new MateriaCursada("Programacion", true));
        materias3.add(new MateriaCursada("Matematica", true));
        materias3.add(new MateriaCursada("Fisica", false));
        materias3.add(new MateriaCursada("Estructura de datos", true));
        // ARREGLO
        Estudiante[] estudiantes = new Estudiante[6];
        estudiantes[0] = new Estudiante("Ana", 20, c1, materias3);
        estudiantes[1] = new Estudiante("Luis", 21, c2, materias2);
        estudiantes[2] = new Estudiante("María", 19, c3, materias3);
        estudiantes[3] = new Estudiante("Juan", 22, c1, materias2);
        estudiantes[4] = new Estudiante("Elena", 20, c1, materias3);
        estudiantes[5] = new Estudiante("Carlos", 22, c1, materias2);
        EstudiantesController controller = new EstudiantesController();
        // Ordenar estudiantes por facultad
        controller.ordenarPorFacultad(estudiantes);
        System.out.println("Estudiantes ordenados por facultad:");
        for (Estudiante e : estudiantes) {
            if (e != null) {
                System.out.println(e.getNombre() + " - Facultad: " + e.getCarrera().getFacultad().getNombre());
            }
        }
        // Ordenar por edad
        controller.ordenarSeleccionPorEdad(estudiantes);
        System.out.println("Estudiantes ordenados por edad: ");
        for (Estudiante e : estudiantes) {
            if (e != null) {
                System.out.println(e.getNombre() + " - Edad: " + e.getEdad());
            }
        }
        // Ordenar por materas no aprobadas
        controller.ordenarPorMateriasNoAprobadas(estudiantes);
        System.out.println("\nEstudiantes ordenados por materias no aprobadas:");
        for (Estudiante e : estudiantes) {
            if (e != null) {
                int noAprobadas = 0;
                for (MateriaCursada materia : e.getMaterias()) {
                    if (!materia.isAprobada()) {
                        noAprobadas++;
                    }
                }
                System.out.println(e.getNombre() + " - No aprobadas: " + noAprobadas);
            }
        }
    }
}