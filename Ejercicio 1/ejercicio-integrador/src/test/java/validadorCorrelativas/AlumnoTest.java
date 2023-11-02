package validadorCorrelativas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlumnoTest {

    @Test
    public void estaAprobada_cuandoMateriaNoEstaAprobadaEntoncesRetornaFalse() {
        // Given
        Alumno alumno = new Alumno("Juan", "ARF56778");
        Materia programacionI = new Materia("Programacion I");

        // When
        boolean resultado = alumno.estaAprobada(programacionI);

        // Then
        Assertions.assertFalse(resultado);
    }

    @Test
    public void estaAprobada_cuandoMateriaEstaAprobadaEntoncesRetornaTrue() {
        // Given
        Alumno alumno = new Alumno("Juan", "ARF56778");
        Materia programacionI = new Materia("Programacion I");
        alumno.agregarAprobada(programacionI);

        // When
        boolean resultado = alumno.estaAprobada(programacionI);

        // Then
        Assertions.assertTrue(resultado);
    }
}