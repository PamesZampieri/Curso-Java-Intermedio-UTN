package entidades;

import java.util.ArrayList;
import java.util.List;

public class Tecnico {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    private List<Especialidad> especialidad;

    private Incidente incidenteAsignado;

    public Tecnico(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.especialidad = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<Especialidad> especialidad) {
        this.especialidad = especialidad;
    }

    public Incidente getIncidenteAsignado() {
        return incidenteAsignado;
    }

    public void setIncidenteAsignado(Incidente incidenteAsignado) {
        this.incidenteAsignado = incidenteAsignado;
    }

    //TODO:
    public boolean estaDisponible() {
        return true;
    }

    //TODO:
    public List<Incidente> listarIncidentePorEstado() {
        return null;
    }
}