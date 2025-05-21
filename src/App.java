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

        Estudiante[] estudiantes = new Estudiante[50];

        estudiantes[0] = new Estudiante("Ana", 20 , c1, materias3);
        estudiantes[1] = new Estudiante("Luis", 21, c1, materias2);
        estudiantes[2] = new Estudiante("María", 19, c1, materias3);
        estudiantes[3] = new Estudiante("Juan", 22, c1, materias2);
        estudiantes[4] = new Estudiante("Elena", 20, c1, materias3);
        estudiantes[5] = new Estudiante("Carlos", 22, c1, materias2);
        estudiantes[6] = new Estudiante("Pedro", 20, c1, materias3);
        estudiantes[7] = new Estudiante("Sofía", 21, c1, materias3);
        estudiantes[8] = new Estudiante("Fernando", 23, c1, materias2);
        estudiantes[9] = new Estudiante("Lucía", 19, c2, materias2);
        estudiantes[10] = new Estudiante("Raúl", 24, c2, materias3);
        estudiantes[11] = new Estudiante("Marta", 22, c2, materias2);
        estudiantes[12] = new Estudiante("José", 20, c2, materias3);
        estudiantes[13] = new Estudiante("Pablo", 25, c2, materias2);
        estudiantes[14] = new Estudiante("Claudia", 21, c2, materias3);
        estudiantes[15] = new Estudiante("Antonio", 23, c2, materias2);
        estudiantes[16] = new Estudiante("Sara", 19, c2, materias3);
        estudiantes[17] = new Estudiante("Diego", 22, c2, materias2);
        estudiantes[18] = new Estudiante("Alicia", 20, c2, materias3);
        estudiantes[19] = new Estudiante("Óscar", 21, c2, materias2);
        estudiantes[20] = new Estudiante("Cristina", 20, c2, materias3);
        estudiantes[21] = new Estudiante("Carmen", 24, c1, materias2);
        estudiantes[22] = new Estudiante("Julio", 19, c1, materias3);
        estudiantes[23] = new Estudiante("Eva", 22, c1, materias2);
        estudiantes[24] = new Estudiante("Tomás", 20, c1, materias1);
        estudiantes[25] = new Estudiante("Valeria", 23, c1, materias1);
        estudiantes[26] = new Estudiante("Alberto", 21, c1, materias1);
        estudiantes[27] = new Estudiante("Rosa", 25, c1, materias1);
        estudiantes[28] = new Estudiante("Carlos", 19, c1, materias1);
        estudiantes[29] = new Estudiante("Manuel", 22, c1, materias1);
        estudiantes[30] = new Estudiante("Lucía", 21, c1, materias1);
        estudiantes[31] = new Estudiante("Nicolás", 20, c1, materias1);
        estudiantes[32] = new Estudiante("Santiago", 23, c1, materias1);
        estudiantes[33] = new Estudiante("Raquel", 21, c1, materias1);
        estudiantes[34] = new Estudiante("Marina", 24, c1, materias1);
        estudiantes[35] = new Estudiante("Laura", 19, c3, materias1);
        estudiantes[36] = new Estudiante("José", 22, c3, materias1);
        estudiantes[37] = new Estudiante("Isabel", 20, c3, materias1);
        estudiantes[38] = new Estudiante("Miguel", 21, c3, materias1);
        estudiantes[39] = new Estudiante("Beatriz", 23, c3, materias1);
        estudiantes[40] = new Estudiante("Elena", 19, c3, materias1);
        estudiantes[41] = new Estudiante("Javier", 22, c3, materias1);
        estudiantes[42] = new Estudiante("Verónica", 20, c3, materias1);
        estudiantes[43] = new Estudiante("Ricardo", 21, c3, materias1);
        estudiantes[44] = new Estudiante("Miriam", 23, c3, materias1);
        estudiantes[45] = new Estudiante("Francisco", 19, c3, materias1);
        estudiantes[46] = new Estudiante("Rafael", 22, c1, materias1);
        estudiantes[47] = new Estudiante("Sandra", 21, c1, materias2);
        estudiantes[48] = new Estudiante("Victoria", 23, c1, materias1);
        estudiantes[49] = new Estudiante("Luis", 20, c1, materias2);

        EstudiantesController controller = new EstudiantesController();

        // Ordenar estudiantes por facultad
        controller.ordenarPorFacultad(estudiantes);

        System.out.println("Estudiantes ordenados por facultad:");
        for (Estudiante e : estudiantes) {
            if (e != null) { 
                System.out.println(e.getNombre() + " - Facultad: " + e.getCarrera().getFacultad().getNombre());
            }
        }

        //Ordenar por materas no aprobadas
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