package tendenciasMusicales;

public class EnAuge extends Popularidad {
    public EnAuge() {
        this.icono = Icono.ROCKET;
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return String.format("Nombre del artista: %s – Título de la canción: %s (Nombre del Álbum: %s - Año del Álbum: %s)",
                cancion.getArtista(), cancion.getNombre(), cancion.getAlbum(), cancion.getAnio());
    }

    @Override
    public void actualizarPopularidad(Cancion cancion) {
        if (cancion.getReproducciones() > 50000 && cancion.getCantidadMeGusta() > 20000) {
            cancion.setPopularidad(new Tendencia());
        }

        if (cancion.getCantidadNoMeGusta() >= 5000) {
            cancion.setPopularidad(new Normal());
        }
    }
}