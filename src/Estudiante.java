import java.util.List;

public class Estudiante {
    private String nombre;
    private int edad;
    private Carrera carrera;
    private List<MateriaCursada> materias;

    public Estudiante(String nombre, int edad, Carrera carrera, List<MateriaCursada> materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public List<MateriaCursada> getMaterias() {
        return materias;
    }

    public Carrera getCarrera() {
        return carrera;
    }
}
