package tendenciasMusicales;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TendenciaTest {
    @Test
    public void cancionCambiaPopularidadDeEnAugeATendencia() {
        // Given
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head",
                "2002");
        cancion.setPopularidad(new EnAuge());

        //When
        for (int i = 0; i < 50001; i++) {
            cancion.reproducir();
        }

        for (int i = 0; i < 20001; i++) {
            cancion.darMeGusta();
        }

        // Then
        Assertions.assertEquals(Tendencia.class, cancion.getPopularidad().getClass());
    }

    @Test
    public void cancionCambiaPopularidadDeTendenciaANormal() {
        // Given
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head",
                "2002");
        cancion.setPopularidad(new Tendencia());
        cancion.setReproduccionesUltimoDia(0);

        //When
        cancion.actualizarPopularidad();

        // Then
        Assertions.assertEquals(Normal.class, cancion.getPopularidad().getClass());
    }
}