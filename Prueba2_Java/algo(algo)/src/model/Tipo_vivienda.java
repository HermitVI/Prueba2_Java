package model;

public class Tipo_vivienda {
    private int id;
    private String estado;

    public Tipo_vivienda(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public Tipo_vivienda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TipoVivienda{" + "id=" + id + ", estado=" + estado + '}';
    }

    
}

