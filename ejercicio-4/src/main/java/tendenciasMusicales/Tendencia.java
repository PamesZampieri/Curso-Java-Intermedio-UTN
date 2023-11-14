package tendenciasMusicales;

public class Tendencia extends Popularidad {
    public Tendencia() {
        this.icono = Icono.FIRE;
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return String.format("Título de la canción: %s - Nombre del artista: %s (Nombre del álbum: %s – Año del álbum: %s)",
                cancion.getNombre(), cancion.getArtista(), cancion.getAlbum(), cancion.getAnio());
    }

    @Override
    public void actualizarPopularidad(Cancion cancion) {
        if (cancion.getReproduccionesUltimoDia() == 0) {
            cancion.setPopularidad(new Normal());
        }
    }
}