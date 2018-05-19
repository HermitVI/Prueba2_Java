package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data{

    private final Conexion con;
    private String query;
    private ResultSet rs;
    private List<Cliente> listaClientes;
    private List<TipoUsuario> listaUsers;
    private List<Tipo_vivienda> listaVivienda;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "bd_Prueba2", "root", "");
    }

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
        query = "SELECT * FROM tipo_usuario";
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
    public List<Tipo_vivienda> readVivienda() throws SQLException{
        query = "SELECT * FROM Tipo_vivienda";
        rs = con.ejecutarSelect(query);
        listaVivienda= new ArrayList<>();
        
        Tipo_vivienda v;
        while(rs.next()){
            v = new Tipo_vivienda();
            
            v.setId(rs.getInt(1));
            v.setEstado(rs.getString(2));

            listaVivienda.add(v);
        }
        
        con.close();
        return listaVivienda;
    }
    public Usuario getCiudadBy(int rut) throws SQLException {
        query = "select * from usuario where rut = " + rut;
        rs = con.ejecutarSelect(query);

        Usuario u = null;
        if (rs.next()) { //existe algun otro registro?
            u = new Usuario();

            u.setRun(rs.getString(1));

        }
        con.close();
        return u;

    }
    
    
}
//    public void updateCiudad(Ciudad mod) throws SQLException {
//        query = "UPDATE ciudad SET nombre = '" + mod.getNombre() + "' WHERE id = " + mod.getId();
//        con.ejecutar(query);
//    }
//
//    public void deleteCiudad(int id) throws SQLException {
//        query = "DELETE FROM ciudad WHERE id= " + id;
//        con.ejecutar(query);
//    }
//
//    buscar por nombre
//    public List<Ciudad> searchCiudad(String exp) throws SQLException {
//        query = "SELECT * FROM ciudad WHERE nombre LIKE '%" + exp + "%' ";
//        rs = con.ejecutarSelect(query);
//
//        listaCiudades = new ArrayList();
//
//        Ciudad c;
//        while (rs.next()) { //existe algun otro registro?
//            c = new Ciudad();
//
//            c.setId(rs.getInt(1));
//            c.setNombre(rs.getString(2));
//
//            listaCiudades.add(c);
//        }
//        con.close();
//        return listaCiudades;
//
//    }
//
//    buscar por id
//    public Ciudad getCiudadBy(int id) throws SQLException {
//        query = "select * from ciudad where id = " + id;
//        rs = con.ejecutarSelect(query);
//
//        Ciudad c = null;
//        if (rs.next()) { //existe algun otro registro?
//            c = new Ciudad();
//
//            c.setId(rs.getInt(1));
//            c.setNombre(rs.getString(2));
//
//             listaCiudad.add(c);
//        }
//        con.close();
//        return c;
//
//    }
//    CRUD CIUDAD
//
//    /*-----------------------------------------------------*/
//    CRUD CLIENTE
//    public void createCliente(Cliente nuevo) throws SQLException {
//        query = "INSERT INTO cliente VALUES(NULL, '" + nuevo.getNombre() + "', '" + nuevo.getCiudad() + "', 0 );";
//        con.ejecutar(query);
//    }
//
//    public List<Cliente> readCliente() throws SQLException {
//        query = "SELECT * FROM cliente";
//        rs = con.ejecutarSelect(query);
//
//        listaClientes = new ArrayList<>();
//
//        Cliente c;
//        while (rs.next()) {
//            c = new Cliente();
//
//            c.setId(rs.getInt(1));
//            c.setNombre(rs.getString(2));
//            c.setCiudad(rs.getInt(3));
//            c.setSueldo(rs.getInt(4));
//
//            listaClientes.add(c);
//        }
//        con.close();
//        return listaClientes;
//    }
//
//    public void updateCliente(Cliente mod) throws SQLException {
//        query = "UPDATE cliente SET nombre = '" + mod.getNombre() + "' WHERE id = " + mod.getId();
//        con.ejecutar(query);
//    }
//
//    public void deleteCliente(int id) throws SQLException {
//        query = "DELETE FROM cliente WHERE id= " + id;
//        con.ejecutar(query);
//    }
//
//    buscar por nombre
//    public List<Cliente> searchCliente(String exp) throws SQLException {
//        query = "SELECT * FROM cliente WHERE nombre LIKE '%" + exp + "%' ";
//        rs = con.ejecutarSelect(query);
//
//        listaClientes = new ArrayList<>();
//
//        Cliente c;
//        while (rs.next()) { //existe algun otro registro?
//            c = new Cliente();
//
//            c.setId(rs.getInt(1));
//            c.setNombre(rs.getString(2));
//            c.setCiudad(rs.getInt(3));
//            c.setSueldo(rs.getInt(4));
//
//            listaClientes.add(c);
//        }
//        con.close();
//        return listaClientes;
//
//    }
//
//    buscar por id
//    public Cliente getClienteBy(int id) throws SQLException {
//        query = "select * from ciudad where id = " + id;
//        rs = con.ejecutarSelect(query);
//
//        Cliente c = null;
//        if (rs.next()) { //existe algun otro registro?
//            c = new Cliente();
//
//            c.setId(rs.getInt(1));
//            c.setNombre(rs.getString(2));
//            c.setCiudad(rs.getInt(3));
//            c.setSueldo(rs.getInt(4));
//        }
//        con.close();
//        return c;
//    }
//    
//    public List<ClienteSelect> getClientes() throws SQLException{
//        List<ClienteSelect> lista = new ArrayList<>();
//        
//        query = "SELECT " +
//                "    cli.id," +
//                "    cli.nombre," +
//                "    ciu.nombre AS 'ciudad',"
//                + "  cli.sueldo " +
//                "FROM" +
//                "    cliente cli " +
//                "INNER JOIN" +
//                "    ciudad ciu ON cli.ciudad = ciu.id;";
//        
//         vista --> youtube --> mysql
//        rs = con.ejecutarSelect(query);
//        
//        ClienteSelect cs;
//        while(rs.next()){
//            cs = new ClienteSelect();
//            
//            cs.setId(rs.getInt(1));
//            cs.setNombre(rs.getString(2));
//            cs.setCiudadString(rs.getString(3));
//            cs.setSueldo(rs.getInt(4));
//            
//            lista.add(cs);
//        }
//        
//        con.close();
//        
//        return lista;
//    }
//    
//    public float getPromedioSueldos() throws SQLException{
//        float prom = -1;
//        
//        query = "SELECT AVG(sueldo) FROM cliente;";
//        
//        rs = con.ejecutarSelect(query);
//        
//        if(rs.next()){
//            prom = rs.getFloat(1);
//        }
//        
//        con.close();
//    
//        return prom;
//    }
//    
//    
//    /*Suposición*/
//    /*Ver listado de ventas por rango de fechas*/
//    
//    public List<Venta> getVentas(String fechaIni, String fechaFinal){
//        query = "SELECT * FROM venta WHERE fecha BETWEEN '"+fechaIni+"' AND '"+fechaFinal+"'";
//    }
//    
//    
//    
//    /*Suposición*/
//    
//    
//    
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Data d = new Data();
//        
//        System.out.println(d.getPromedioSueldos());
//        
//        #somosnada
//        for (ClienteSelect cs : d.getClientes()) {
//            System.out.println("--------------------");
//            System.out.println(cs.getId());
//            System.out.println(cs.getNombre());
//            System.out.println(cs.getCiudadString());
//            System.out.println("$"+cs.getSueldo());
//        }
//    }
//    

