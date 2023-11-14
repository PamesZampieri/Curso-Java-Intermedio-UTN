package tendenciasMusicales;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnAugeTest {
    @Test
    public void cancionCambiaPopularidadDeNormalAEnAuge() {
        // Given
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head",
                "2002");

        //When
        for (int i = 0; i < 1001; i++) {
            cancion.reproducir();
        }

        // Then
        Assertions.assertEquals(EnAuge.class, cancion.getPopularidad().getClass());
    }

    @Test
    public void cancionCambiaPopularidadDeEnAugeANormal() {
        // Given
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head",
                "2002");
        cancion.setPopularidad(new EnAuge());

        //When
        for (int i = 0; i < 5000; i++) {
            cancion.darNoMeGusta();
        }

        // Then
        Assertions.assertEquals(Normal.class, cancion.getPopularidad().getClass());
    }
}