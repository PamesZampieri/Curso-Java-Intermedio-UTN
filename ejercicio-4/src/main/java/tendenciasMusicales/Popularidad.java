package tendenciasMusicales;

public abstract class Popularidad {
    protected Icono icono;

    public void mostrarDescripcion(Cancion cancion) {
        System.out.printf("%s - %s%n", icono, getLeyenda(cancion));
    }

    public abstract String getLeyenda(Cancion cancion);

    public abstract void actualizarPopularidad(Cancion cancion);
}