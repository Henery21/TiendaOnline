package com.project.procesos;

import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Ingresos;

public class daoIngresos {
    public ArrayList <Ingresos> consultarIngresos ( String Texto){
     ArrayList listaIngresos =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Detalle_Ingreso,ID_Ingreso,ID_Categoria,cantidad,precio "
                    + "from DetalleIngreso where ID_Detalle_Ingreso like ? or ID_Ingreso like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Ingresos ingresos = new Ingresos (rs.getInt(1), rs.getInt(2), rs.getInt(3), 
                        rs.getInt(4),rs.getDouble(5));
                listaIngresos.add(ingresos);
            }
            ps.close();
            conexion.desconectar();
            return listaIngresos;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarIngresos(Ingresos ingresos){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into DetalleIngreso values (?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,ingresos.getID_Detalle_Ingreso());
            ps.setInt(2,ingresos.getID_Ingreso());
            ps.setInt(3,ingresos.getID_Categoria());
            ps.setInt(4,ingresos.getCantidad());
            ps.setDouble(5,ingresos.getPrecio());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarIngresos(Ingresos ingresos){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update DetalleIngreso set ID_Ingreso=?,ID_Categoria=?,cantidad=? where ID_Detalle_Ingreso=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,ingresos.getID_Detalle_Ingreso());
            ps.setInt(2,ingresos.getID_Ingreso());
            ps.setInt(3,ingresos.getID_Categoria());
            ps.setInt(4,ingresos.getCantidad());
            ps.setDouble(5,ingresos.getPrecio());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarIngresos(int id){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from DetalleIngreso where ID_Detalle_Ingreso=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,id);
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }

    }
}
