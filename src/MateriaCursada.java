public class MateriaCursada {
    private String nombre;
    private boolean aprobada;

    public MateriaCursada(String nombre, boolean aprobada) {
        this.nombre = nombre;
        this.aprobada = aprobada;
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public String getNombre() {
        return nombre;
    }
}
