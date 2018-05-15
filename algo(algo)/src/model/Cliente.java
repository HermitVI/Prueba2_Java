package model;


public class Cliente {
    private String run;
    private String nombre;
    private int sueldo;
    private date fecha_reg;

    public Cliente() {
    }

    public Cliente(String run, String nombre, int sueldo, date fecha_reg) {
        this.run = run;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fecha_reg = fecha_reg;
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

    public date getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(date fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    @Override
    public String toString() {
        return "Cliente{" + "run=" + run + ", nombre=" + nombre + ", sueldo=" + sueldo + ", fecha_reg=" + fecha_reg + '}';
    }
    
}
