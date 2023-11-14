package tendenciasMusicales;

public class Main {
    public static void main( String[] args ) {
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head",
                "2002");

        cancion.reproducir();
        cancion.setPopularidad(new EnAuge());
        cancion.reproducir();
        cancion.setPopularidad(new Tendencia());
        cancion.reproducir();
    }
}