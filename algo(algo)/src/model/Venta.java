package model;


public class Venta {
    private int id;
    private int usuario_fk;
    private int cliente_fk;
    private date fecha;
    private int vivienda_fk;

    public Venta() {
    }

    public Venta(int id, int usuario_fk, int cliente_fk, date fecha, int vivienda_fk) {
        this.id = id;
        this.usuario_fk = usuario_fk;
        this.cliente_fk = cliente_fk;
        this.fecha = fecha;
        this.vivienda_fk = vivienda_fk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_fk() {
        return usuario_fk;
    }

    public void setUsuario_fk(int usuario_fk) {
        this.usuario_fk = usuario_fk;
    }

    public int getCliente_fk() {
        return cliente_fk;
    }

    public void setCliente_fk(int cliente_fk) {
        this.cliente_fk = cliente_fk;
    }

    public date getFecha() {
        return fecha;
    }

    public void setFecha(date fecha) {
        this.fecha = fecha;
    }

    public int getVivienda_fk() {
        return vivienda_fk;
    }

    public void setVivienda_fk(int vivienda_fk) {
        this.vivienda_fk = vivienda_fk;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", usuario_fk=" + usuario_fk + ", cliente_fk=" + cliente_fk + ", fecha=" + fecha + ", vivienda_fk=" + vivienda_fk + '}';
    }
    
}
