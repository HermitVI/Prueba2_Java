package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private final Conexion con;
    private String query;
    private ResultSet rs;
    private List<Cliente> listaClientes;
    private List<Usuario> listaVendedor;
    private List<TipoUsuario> listaUsers;
    private List<Vivienda> listaVivienda;
    

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "bd_Prueba2", "root", "");
    }

//  CRUD CIUDAD
    public void createCliente(Cliente nueva) throws SQLException {
        query = "INSERT INTO cliente VALUES('"+ nueva.getRun()+"','" + nueva.getNombre() + "','"+ nueva.getSueldo()+"', NOW());";
        con.ejecutar(query);
    }
    
    public List<Cliente> readCliente() throws SQLException {
        query = "SELECT * FROM cliente ORDER BY nombre ASC";
        rs = con.ejecutarSelect(query);
        listaClientes = new ArrayList<>();

        Cliente c;
        while (rs.next()) { //existe algun otro registro?
            c = new Cliente();

            c.setRun(rs.getString(1));
            c.setNombre(rs.getString(2));
            c.setSueldo(rs.getInt(3));

            listaClientes.add(c);
        }
        con.close();
        return listaClientes;
    }

    
     public List<TipoUsuario> readUsuario() throws SQLException{
        query = "SELECT * FROM tipo_usuario ORDER BY nombre ASC";
        rs = con.ejecutarSelect(query);
        listaUsers= new ArrayList<>();
        
        TipoUsuario u;
        while(rs.next()){
            u = new TipoUsuario();
            
            u.setId(rs.getInt(1));
            u.setNombre(rs.getString(2));

            listaUsers.add(u);
        }
        con.close();
        return listaUsers;
        
    }
    public void createVivienda(Vivienda nueva) throws SQLException {
        query = "insert into vivienda VALUES ("+nueva.getRol()+",'"+nueva.getDireccion()+"',"+nueva.getCant_Pieza()+","+nueva.getCant_Baño()+","+nueva.getTipo_vivienda_fk()+","+nueva.isTipo()+","+nueva.getPrecio()+","+nueva.isEstado()+");";
        con.ejecutar(query);
    }
    
    public void createUsuario(Usuario nueva) throws SQLException {
        query = "INSERT INTO usuario VALUES('"+ nueva.getRun()+"','" + nueva.getNombre() + "',2, NOW());";
        con.ejecutar(query);
    }
    
    public List<Usuario> getVendedor() throws SQLException{
        query = "SELECT * FROM usuario WHERE tipo_usuaruo_fk = 2";
        rs = con.ejecutarSelect(query);
        listaVendedor= new ArrayList<>();
        
        Usuario u;
        while(rs.next()){
            u = new Usuario();
            
            u.setRun(rs.getString(1));
            u.setNombre(rs.getString(2));
            u.setTipo_usuario_fk(rs.getInt(3));

            listaVendedor.add(u);
        }
        con.close();
        return listaVendedor;
        
    }
    public List<Vivienda> readVivienda() throws SQLException{
        query = "SELECT * FROM vivienda";
        rs = con.ejecutarSelect(query);
        listaVivienda= new ArrayList<>();
        
        Vivienda v;
        while(rs.next()){
            v = new Vivienda();
            
            v.setRol(rs.getInt(1));
            v.setDireccion(rs.getString(2));
            v.setCant_Pieza(rs.getInt(3));
            v.setCant_Baño(rs.getInt(4));
            v.setTipo_vivienda_fk(rs.getInt(5));
            v.setTipo(rs.getBoolean(6));
            v.setPrecio(rs.getInt(7));
            v.setEstado(rs.getBoolean(8));
            

            listaVivienda.add(v);
        }
        con.close();
        return listaVivienda;
        
    }
    public void createVenta(Venta nueva) throws SQLException {
        query = "INSERT INTO cliente VALUES('"+ nueva.getUsuario_fk()+"','" + nueva.getCliente_fk() + "','"+ nueva.getVivienda_fk()+"', NOW());";
        con.ejecutar(query);
    }
}
