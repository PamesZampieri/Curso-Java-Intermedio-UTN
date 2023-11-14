package tendenciasMusicales;

public class Cancion {
    private String nombre;
    private String artista;
    private String album;
    private String anio;
    private int reproducciones;
    private int cantidadMeGusta;
    private int cantidadNoMeGusta;
    private int reproduccionesUltimoDia;
    private Popularidad popularidad;

    public Cancion(String nombre, String artista, String album, String anio) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.anio = anio;
        this.popularidad = new Normal();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getReproduccionesUltimoDia() {
        return reproduccionesUltimoDia;
    }

    public void setReproduccionesUltimoDia(int reproduccionesUltimoDia) {
        this.reproduccionesUltimoDia = reproduccionesUltimoDia;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public void setCantidadMeGusta(int cantidadMeGusta) {
        this.cantidadMeGusta = cantidadMeGusta;
    }

    public int getCantidadNoMeGusta() {
        return cantidadNoMeGusta;
    }

    public void setCantidadNoMeGusta(int cantidadNoMeGusta) {
        this.cantidadNoMeGusta = cantidadNoMeGusta;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    // Método dependiente del estado
    public void reproducir() {
        mostrarDescripcion();

        reproducciones++;
        actualizarPopularidad();
    }

    // Método dependiente del estado
    public void darMeGusta() {
        System.out.println("Dar me gusta " + nombre);

        cantidadMeGusta++;
        actualizarPopularidad();
    }

    // Método dependiente del estado
    public void darNoMeGusta() {
        System.out.println("Dar no me gusta " + nombre);

        cantidadNoMeGusta++;
        actualizarPopularidad();
    }

    // Método dependiente del estado
    public void mostrarDescripcion() {
        popularidad.mostrarDescripcion(this);
    }

    // Método dependiente del estado
    public void actualizarPopularidad() {
        popularidad.actualizarPopularidad(this);
    }
}