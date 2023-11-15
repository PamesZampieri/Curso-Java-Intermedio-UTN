public class TipoProblema {
    private String nombre;
    private int tiempoMaximoEstimadoDeResolucion;

    public TipoProblema(String nombre, int tiempoMaximoEstimadoDeResolucion) {
        this.nombre = nombre;
        this.tiempoMaximoEstimadoDeResolucion = tiempoMaximoEstimadoDeResolucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoMaximoEstimadoDeResolucion() {
        return tiempoMaximoEstimadoDeResolucion;
    }

    public void setTiempoMaximoEstimadoDeResolucion(int tiempoMaximoEstimadoDeResolucion) {
        this.tiempoMaximoEstimadoDeResolucion = tiempoMaximoEstimadoDeResolucion;
    }
}