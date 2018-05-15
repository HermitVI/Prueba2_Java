package model;

public class TipoUsuario {
    private int id;
    private String nombre;

    public TipoUsuario() {
    }

    public TipoUsuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tipo_usuario{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}