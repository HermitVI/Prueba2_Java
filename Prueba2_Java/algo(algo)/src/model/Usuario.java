package model;

import java.sql.Date;

public class Usuario {
    private String run;
    private String nombre;
    private int tipo_usuario_fk;
    private Date fecha_con;

    public Usuario(String run, String nombre, int tipo_usuario_fk, Date fecha_con) {
        this.run = run;
        this.nombre = nombre;
        this.tipo_usuario_fk = tipo_usuario_fk;
        this.fecha_con = fecha_con;
    }

    public Usuario() {
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo_usuario_fk() {
        return tipo_usuario_fk;
    }

    public void setTipo_usuario_fk(int tipo_usuario_fk) {
        this.tipo_usuario_fk = tipo_usuario_fk;
    }

    public Date getFecha_con() {
        return fecha_con;
    }

    public void setFecha_con(Date fecha_con) {
        this.fecha_con = fecha_con;
    }

    @Override
    public String toString() {
        return "Usuario{" + "run=" + run + ", nombre=" + nombre + 
                ", tipo_usuario_fk=" + tipo_usuario_fk + ", fecha_con=" +
                fecha_con + '}';
    }
    
    
}
