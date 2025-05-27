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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public List<MateriaCursada> getMaterias() {
        return materias;
    }

    public void setMaterias(List<MateriaCursada> materias) {
        this.materias = materias;
    }

    
}
