/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lastorga
 */
public class Vivienda {
    private int rol;
    private String direccion;
    private int cant_pieza;
    private int cant_banios;
    private int tipo_vivienda_fk;
    private boolean tipo;
    private int precio;
    private boolean estado;

    public Vivienda() {
    }

    public Vivienda(int rol, String direccion, int cant_pieza, int cant_banios, int tipo_vivienda_fk, boolean tipo, int precio, boolean estado) {
        this.rol = rol;
        this.direccion = direccion;
        this.cant_pieza = cant_pieza;
        this.cant_banios = cant_banios;
        this.tipo_vivienda_fk = tipo_vivienda_fk;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
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

    public int getCant_pieza() {
        return cant_pieza;
    }

    public void setCant_pieza(int cant_pieza) {
        this.cant_pieza = cant_pieza;
    }

    public int getCant_banios() {
        return cant_banios;
    }

    public void setCant_banios(int cant_banios) {
        this.cant_banios = cant_banios;
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
        return "Vivienda{" + "rol=" + rol + ", direccion=" + direccion + ", cant_pieza=" + cant_pieza + ", cant_banios=" + cant_banios + ", tipo_vivienda_fk=" + tipo_vivienda_fk + ", tipo=" + tipo + ", precio=" + precio + ", estado=" + estado + '}';
    }
    
}
