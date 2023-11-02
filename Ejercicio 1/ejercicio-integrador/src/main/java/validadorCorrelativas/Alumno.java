package validadorCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String legajo;

    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean estaAprobada(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }

    public void agregarAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }
}