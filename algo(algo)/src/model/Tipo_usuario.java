package model;


public class Tipo_usuario {
    private int id;
    private String nombre;

    public Tipo_usuario() {
    }

    public Tipo_usuario(int id, String nombre) {
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
