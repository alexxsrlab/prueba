public class Carrera{
    private String nombre;
    private Facultad facultad;

    public Carrera(String nombre, Facultad facultad) {
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public String getNombre() {
        return nombre;
    }
}