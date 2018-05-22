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
    private List<TipoUsuario> listaUsers;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "bd_Prueba2", "root", "");
    }

//  CRUD CIUDAD
    public void createCliente(Cliente nueva) throws SQLException {
        query = "INSERT INTO cliente VALUES('"+ nueva.getRun()+"','" + nueva.getNombre() + "','"+ nueva.getSueldo()+");";
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
}
