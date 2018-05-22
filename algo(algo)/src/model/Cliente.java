package model;

import java.sql.Date;

public class Cliente {
    private String run;
    private String nombre;
    private int sueldo;
    private Date fecha;

    public Cliente(String run, String nombre, int sueldo, Date fecha) {
        this.run = run;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fecha = fecha;
    }

    public Cliente() {
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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
