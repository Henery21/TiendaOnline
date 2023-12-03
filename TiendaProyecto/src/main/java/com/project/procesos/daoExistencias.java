package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.ExistenciasProductos;

public class daoExistencias {
    public ArrayList <ExistenciasProductos> consultarExistencias ( String Texto){
     ArrayList listaExistencias =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Proveedor,nombre,direccion,telefono,correo,notas from Proveedores where nombre like ? or correo like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ExistenciasProductos existenciasProductos = new ExistenciasProductos (rs.getInt(1), 
                        rs.getInt(2), rs.getInt(3), rs.getString(4),rs.getString(5),
                        rs.getDouble(6), rs.getDouble(7), rs.getString(8));
                listaExistencias.add(existenciasProductos);
            }
            ps.close();
            conexion.desconectar();
            return listaExistencias;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarExistencias(ExistenciasProductos existenciasProductos){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into ExistenciasProductos values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,existenciasProductos.getID_Existencia());
            ps.setInt(2,existenciasProductos.getID_Articulo());
            ps.setInt(3,existenciasProductos.getCantidad());
            ps.setString(4,existenciasProductos.getFechaIngreso());
            ps.setString(5,existenciasProductos.getUbicacion());
            ps.setDouble(6,existenciasProductos.getPrecioCompra());
            ps.setDouble(7,existenciasProductos.getPrecioVenta());
            ps.setString(8,existenciasProductos.getEstado());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarExistencias(ExistenciasProductos existenciasProductos){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update ExistenciasProductos set ID_Articulo=?,cantidad=?,fechaIngreso=? where ID_Existencia=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,existenciasProductos.getID_Existencia());
            ps.setInt(2,existenciasProductos.getID_Articulo());
            ps.setInt(3,existenciasProductos.getCantidad());
            ps.setString(4,existenciasProductos.getFechaIngreso());
            ps.setString(5,existenciasProductos.getUbicacion());
            ps.setDouble(6,existenciasProductos.getPrecioCompra());
            ps.setDouble(7,existenciasProductos.getPrecioVenta());
            ps.setString(8,existenciasProductos.getEstado());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarExistencias(int id){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from ExistenciasProductos where ID_Existencia=?";
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
