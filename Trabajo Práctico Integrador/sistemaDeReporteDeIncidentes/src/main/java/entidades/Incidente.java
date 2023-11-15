package entidades;

import estado.CambioEstado;

import java.time.LocalDate;

public class Incidente {
    private LocalDate fechaEstimadaDeResolucion;
    private CambioEstado cambioEstado;

    public Incidente(LocalDate fechaEstimadaDeResolucion, CambioEstado cambioEstado) {
        this.fechaEstimadaDeResolucion = fechaEstimadaDeResolucion;
        this.cambioEstado = cambioEstado;
    }

    public LocalDate getFechaEstimadaDeResolucion() {
        return fechaEstimadaDeResolucion;
    }

    public void setFechaEstimadaDeResolucion(LocalDate fechaEstimadaDeResolucion) {
        this.fechaEstimadaDeResolucion = fechaEstimadaDeResolucion;
    }

    public CambioEstado getCambioEstado() {
        return cambioEstado;
    }

    public void setCambioEstado(CambioEstado cambioEstado) {
        this.cambioEstado = cambioEstado;
    }
}