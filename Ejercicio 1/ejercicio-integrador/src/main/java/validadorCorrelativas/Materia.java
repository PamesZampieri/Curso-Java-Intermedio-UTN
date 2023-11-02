package validadorCorrelativas;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativa(Materia correlativa) {
        this.correlativas.add(correlativa);
    }

    public void removerCorrelativa(Materia correlativa) {
        this.correlativas.remove(correlativa);
    }

    public boolean tieneCorrelativas() {
        return !this.correlativas.isEmpty();
    }

    public boolean puedeCursarse(Alumno alumno) {
        return this.correlativas.stream().allMatch(materiaCorrelativa -> alumno.estaAprobada(materiaCorrelativa));
    }
}