package usuarios;

public class Rol {
    private String nombre;
    private Permiso permiso;

    public Rol(String nombre, Permiso permiso) {
        this.nombre = nombre;
        this.permiso = permiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    //TODO
    //enum Rol
}
