/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author rsanchez
 */
public class Venta {
    private int id;
    private int usuario_fk;
    private int cliente_fk;
    private int vivienda_fk;
    private Date fecha_venta;

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", usuario_fk=" + usuario_fk + ", cliente_fk=" + cliente_fk + ", vivienda_fk=" + vivienda_fk + ", fecha_venta=" + fecha_venta + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario_fk(int usuario_fk) {
        this.usuario_fk = usuario_fk;
    }

    public void setCliente_fk(int cliente_fk) {
        this.cliente_fk = cliente_fk;
    }

    public void setVivienda_fk(int vivienda_fk) {
        this.vivienda_fk = vivienda_fk;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getId() {
        return id;
    }

    public int getUsuario_fk() {
        return usuario_fk;
    }

    public int getCliente_fk() {
        return cliente_fk;
    }

    public int getVivienda_fk() {
        return vivienda_fk;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public Venta() {
    }

    public Venta(int id, int usuario_fk, int cliente_fk, int vivienda_fk, Date fecha_venta) {
        this.id = id;
        this.usuario_fk = usuario_fk;
        this.cliente_fk = cliente_fk;
        this.vivienda_fk = vivienda_fk;
        this.fecha_venta = fecha_venta;
    }
}
