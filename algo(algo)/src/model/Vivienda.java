package model;

public class Vivienda {
    private int rol;
    private String direccion;
    private int cant_Pieza;
    private int cant_Banio;
    private int tipo_vivienda_fk;
    private boolean tipo;
    private int precio;
    private boolean estado;

    

    
    public Vivienda() {
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCant_Pieza() {
        return cant_Pieza;
    }

    public void setCant_Pieza(int cant_Pieza) {
        this.cant_Pieza = cant_Pieza;
    }

    public int getCant_Baño() {
        return cant_Banio;
    }

    public void setCant_Baño(int cant_Baño) {
        this.cant_Banio = cant_Baño;
    }

    public int getTipo_vivienda_fk() {
        return tipo_vivienda_fk;
    }

    public void setTipo_vivienda_fk(int tipo_vivienda_fk) {
        this.tipo_vivienda_fk = tipo_vivienda_fk;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rol: "+rol;
    }

    
    
}
