package model;


public class Usuario {
    private String run;
    private String nombre;
    private int tipo_usuaruo_fk;
    private date fecha_con;

    public Usuario() {
    }

    public Usuario(String run, String nombre, int tipo_usuaruo_fk, date fecha_con) {
        this.run = run;
        this.nombre = nombre;
        this.tipo_usuaruo_fk = tipo_usuaruo_fk;
        this.fecha_con = fecha_con;
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

    public int getTipo_usuaruo_fk() {
        return tipo_usuaruo_fk;
    }

    public void setTipo_usuaruo_fk(int tipo_usuaruo_fk) {
        this.tipo_usuaruo_fk = tipo_usuaruo_fk;
    }

    public date getFecha_con() {
        return fecha_con;
    }

    public void setFecha_con(date fecha_con) {
        this.fecha_con = fecha_con;
    }

    @Override
    public String toString() {
        return "Usuario{" + "run=" + run + ", nombre=" + nombre + ", tipo_usuaruo_fk=" + tipo_usuaruo_fk + ", fecha_con=" + fecha_con + '}';
    }
    
}
