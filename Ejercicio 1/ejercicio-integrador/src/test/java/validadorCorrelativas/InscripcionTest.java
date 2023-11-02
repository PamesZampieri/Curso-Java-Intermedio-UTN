package validadorCorrelativas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InscripcionTest {

    @Test
    public void aprobada_cuandoNoTieneCorrelativasEntoncesRetornaTrue() {
        // Given
        Alumno alumno = new Alumno("Juan", "ARF56778");
        Materia materia = new Materia("Programacion I");
        Inscripcion inscripcion = new Inscripcion(alumno, materia);

        // When
        boolean resultado = inscripcion.aprobada();

        // Then
        Assertions.assertTrue(resultado);
    }

    @Test
    public void aprobada_cuandoTieneCorrelativasNoAprobadasEntoncesRetornaFalse() {
        // Given
        Alumno alumno = new Alumno("Juan", "ARF56778");
        Materia programacionI = new Materia("Programacion I");
        Materia programacionII = new Materia("Programacion II");

        programacionII.agregarCorrelativa(programacionI);
        Inscripcion inscripcionAProgramacionII = new Inscripcion(alumno, programacionII);

        // When
        boolean resultado = inscripcionAProgramacionII.aprobada();

        // Then
        Assertions.assertFalse(resultado);
    }

    @Test
    public void aprobada_cuandoTieneCorrelativasAprobadasEntoncesRetornaTrue() {
        // Given
        Alumno alumno = new Alumno("Juan", "ARF56778");
        Materia programacionI = new Materia("Programacion I");
        Materia programacionII = new Materia("Programacion II");

        alumno.agregarAprobada(programacionI);
        programacionII.agregarCorrelativa(programacionI);

        Inscripcion inscripcionAProgramacionII = new Inscripcion(alumno, programacionII);

        // When
        boolean resultado = inscripcionAProgramacionII.aprobada();

        // Then
        Assertions.assertTrue(resultado);
    }
}