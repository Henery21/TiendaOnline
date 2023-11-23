package com.project.procesos;

import com.project.entidades.Ventas;
import java.sql.*;
import java.util.ArrayList;

public class daoVentas {
    public ArrayList <Ventas> consultarVentas ( String Texto){
     ArrayList listaVentas =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Detalle_Venta,ID_Venta,ID_Articulo,cantidad,impuesto, total "
                    + "from DetalleVenta where ID_Detalle_Venta like ? or ID_Venta like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Ventas ventas = new Ventas (rs.getInt(1), rs.getInt(2),
                        rs.getInt(3),rs.getInt(4),rs.getDouble(5),
                        rs.getDouble(6),rs.getDouble(5));
                listaVentas.add(ventas);
            }
            ps.close();
            conexion.desconectar();
            return listaVentas;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarVentas(Ventas ventas){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into DetalleIngreso values (?,?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,ventas.getID_Detalle_Venta());
            ps.setInt(2,ventas.getID_Venta());
            ps.setInt(3,ventas.getID_Articulo());
            ps.setInt(4,ventas.getCantidad());
            ps.setDouble(5,ventas.getPrecio_Unitario());
            ps.setDouble(6,ventas.getImpuesto());
            ps.setDouble(7,ventas.getTotal());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarVentas(Ventas ventas){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update DetalleVenta set ID_Venta=?,ID_Articulo=?,cantidad=? where ID_Detalle_Venta=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,ventas.getID_Detalle_Venta());
            ps.setInt(2,ventas.getID_Venta());
            ps.setInt(3,ventas.getID_Articulo());
            ps.setInt(4,ventas.getCantidad());
            ps.setDouble(5,ventas.getPrecio_Unitario());
            ps.setDouble(6,ventas.getImpuesto());
            ps.setDouble(7,ventas.getTotal());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarVentas(int id){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from DetalleVenta where ID_Detalle_Venta=?";
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
