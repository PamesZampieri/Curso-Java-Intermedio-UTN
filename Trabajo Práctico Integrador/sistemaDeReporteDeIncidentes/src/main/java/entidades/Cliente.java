package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String razonSocial;
    private String cuil;
    private String email;
    private List<Servicio> servicios;

    public Cliente(String razonSocial, String cuil, String email) {
        this.razonSocial = razonSocial;
        this.cuil = cuil;
        this.email = email;
        this.servicios = new ArrayList<>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}