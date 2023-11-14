package tendenciasMusicales;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NormalTest {
    @Test
    public void cancionRecienSeLanzaYTienePopularidadNormal() {
        // When
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head",
                "2002");

        // Then
        Assertions.assertEquals(Normal.class, cancion.getPopularidad().getClass());
    }
}