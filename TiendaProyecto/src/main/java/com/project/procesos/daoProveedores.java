package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Proveedores;

public class daoProveedores {
    public ArrayList <Proveedores> consultarProveedores ( String Texto){
     ArrayList listaProveedores =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Proveedor,nombre,direccion,telefono,correo,notas from Proveedores where nombre like ? or correo like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Proveedores proveedores = new Proveedores (rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4),rs.getString(5),rs.getString(6));
                listaProveedores.add(proveedores);
            }
            ps.close();
            conexion.desconectar();
            return listaProveedores;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarProveedores(Proveedores proveedores){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Proveedores values (?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,proveedores.getID_Proveedor());
            ps.setString(2,proveedores.getNombre());
            ps.setString(3,proveedores.getDireccion());
            ps.setString(4,proveedores.getTelefono());
            ps.setString(5,proveedores.getCorreo());
            ps.setString(6,proveedores.getNotas());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarProveedores(Proveedores proveedores){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Proveedores set nombre=?,correo=?,telefono=? where ID_Proveedor=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,proveedores.getID_Proveedor());
            ps.setString(2,proveedores.getNombre());
            ps.setString(3,proveedores.getDireccion());
            ps.setString(4,proveedores.getTelefono());
            ps.setString(5,proveedores.getCorreo());
            ps.setString(6,proveedores.getNotas());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarProveedores(Proveedores proveedores){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from Proveedores where ID_Proveedor=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,proveedores.getID_Proveedor());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }

    }
}
