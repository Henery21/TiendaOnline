package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Envios;

public class daoEnvios {
    public ArrayList <Envios> consultarEnvios ( String Texto){
     ArrayList listaEnvios =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Envio,ID_Cliente,ID:Empleado,fechaEnvio,estado,metodoEnvio,notas from Envios where ID_Cliente like ? or fechaEnvio like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Envios envios = new Envios (rs.getInt(1), rs.getInt(2), rs.getInt(3), 
                        rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                listaEnvios.add(envios);
            }
            ps.close();
            conexion.desconectar();
            return listaEnvios;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarEnvios(Envios envios){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Envios values (?,?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,envios.getID_Envio());
            ps.setInt(2,envios.getID_Cliente());
            ps.setInt(3,envios.getID_Empleado());
            ps.setString(4,envios.getFechaEnvio());
            ps.setString(5,envios.getEstado());
            ps.setString(6,envios.getMetodoEnvio());
            ps.setString(7,envios.getNotas());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarEnvios(Envios envios){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Envios set ID_Cliente=?,fechaEnvio=?,telefono=? where ID_Proveedor=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,envios.getID_Envio());
            ps.setInt(2,envios.getID_Cliente());
            ps.setInt(3,envios.getID_Empleado());
            ps.setString(4,envios.getFechaEnvio());
            ps.setString(5,envios.getEstado());
            ps.setString(6,envios.getMetodoEnvio());
            ps.setString(7,envios.getNotas());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarEnvios(Envios envios){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from Envios where ID_Envios=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,envios.getID_Envio());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }

    }
}
