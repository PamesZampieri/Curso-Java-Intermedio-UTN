package tendenciasMusicales;

public class Normal extends Popularidad {
    public Normal() {
        this.icono = Icono.MUSICAL_NOTE;
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return String.format("Nombre del artista: %s – Nombre del álbum: %s – Título de la canción: %s", cancion.getArtista(),
                cancion.getAlbum(), cancion.getNombre());
    }

    @Override
    public void actualizarPopularidad(Cancion cancion) {
        if (cancion.getReproducciones() > 1000) {
            cancion.setPopularidad(new EnAuge());
        }
    }
}