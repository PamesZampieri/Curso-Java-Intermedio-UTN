package validadorCorrelativas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MateriaTest {

    @Test
    public void tieneCorrelativas_cuandoNoTieneCorrelativasEntoncesRetornaFalse() {
        // Given
        Materia programacionI = new Materia("Programacion I");

        // When
        boolean resultado = programacionI.tieneCorrelativas();

        // Then
        Assertions.assertFalse(resultado);
    }

    @Test
    public void tieneCorrelativas_cuandoTieneCorrelativasEntoncesRetornaTrue() {
        // Given
        Materia programacionI = new Materia("Programacion I");
        Materia programacionII = new Materia("Programacion II");

        programacionII.agregarCorrelativa(programacionI);

        // When
        boolean resultado = programacionII.tieneCorrelativas();

        // Then
        Assertions.assertTrue(resultado);
    }

    @Test
    public void puedeCursarse_cuandoTieneCorrelativasNoAprobadasEntoncesRetornaFalse() {
        // Given
        Alumno alumno = new Alumno("Juan", "ARF56778");
        Materia programacionI = new Materia("Programacion I");
        Materia programacionII = new Materia("Programacion II");

        programacionII.agregarCorrelativa(programacionI);

        // When
        boolean resultado = programacionII.puedeCursarse(alumno);

        // Then
        Assertions.assertFalse(resultado);
    }

    @Test
    public void puedeCursarse_cuandoTieneCorrelativasAprobadasEntoncesRetornaTrue() {
        // Given
        Alumno alumno = new Alumno("Juan", "ARF56778");
        Materia programacionI = new Materia("Programacion I");
        Materia programacionII = new Materia("Programacion II");

        programacionII.agregarCorrelativa(programacionI);
        alumno.agregarAprobada(programacionI);

        // When
        boolean resultado = programacionII.puedeCursarse(alumno);

        // Then
        Assertions.assertTrue(resultado);
    }
}