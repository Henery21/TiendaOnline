package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Clientes;

public class daoClientes {
    public ArrayList <Clientes> consultarClientes ( String Texto){
     ArrayList listaClientes =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Cliente,DUI_Cliente,nombresCliente,apellidosCliente,ID_Usuario,telefono,correo,ID_Direccion from Clientes where nombresCliente like ? or apellidosCliente like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Clientes clientes = new Clientes (rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),
                        rs.getInt(8));
                listaClientes.add(clientes);
            }
            ps.close();
            conexion.desconectar();
            return listaClientes;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarClientes(Clientes clientes){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Clientes values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,clientes.getID_Cliente());
            ps.setString(2,clientes.getDUI_Cliente());
            ps.setString(3,clientes.getNombresCliente());
            ps.setString(4,clientes.getApellidosCliente());
            ps.setInt(5,clientes.getID_Usuario());
            ps.setString(6,clientes.getTelefono());
            ps.setString(7,clientes.getCorreo());
            ps.setInt(8,clientes.getID_Direccion());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarClientes(Clientes clientes){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Clientes set nombresCliente=?,correo=?,telefono=? where ID_Cliente=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,clientes.getID_Cliente());
            ps.setString(2,clientes.getDUI_Cliente());
            ps.setString(3,clientes.getNombresCliente());
            ps.setString(4,clientes.getApellidosCliente());
            ps.setInt(5,clientes.getID_Usuario());
            ps.setString(6,clientes.getTelefono());
            ps.setString(7,clientes.getCorreo());
            ps.setInt(8,clientes.getID_Direccion());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarClientes(Clientes clientes){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from Clientes where ID_Cliente=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,clientes.getID_Cliente());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }

    }
}
