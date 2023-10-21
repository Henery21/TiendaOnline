
package com.mystore.tienda.operaciones;
import java.sql.*;
import com.mystore.tienda.entidades.proveedores;
import java.util.ArrayList;

public class daoProveedor {
 public ArrayList <proveedores> consultarProveedor (String Texto){
     ArrayList lista =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "SELECT ID_Proveedor,Nombre,Direccion,Telefono,Correo,Notas FROM TiendaLacteos.dbo.Proveedores where nombre like ? or correo like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                proveedores contacto = new proveedores (rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4),rs.getString(5),rs.getString(6));
                lista.add(contacto);
            }
            ps.close();
            conexion.desconectar();
            return lista;
        } catch (SQLException e) {
            return null;
        }
 }    
 public int insertar(proveedores provee){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Proveedore values (?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,provee.getID_Proveerdor());
            ps.setString(2,provee.getNombre());
            ps.setString(3,provee.getDireccion());
            ps.setString(4,provee.getCorreo());
            ps.setString(5,provee.getTelefono());
            ps.setString(6,provee.getNotas());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificar(proveedores provee){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Proveedores set ID_Proveedor=?,Nombre=?,Direccion=?,Telefono=?,Correo=?,Notas=? where id=?";
            PreparedStatement ps =  con.prepareStatement(sql);
             ps.setInt(1,provee.getID_Proveerdor());
            ps.setString(2,provee.getNombre());
            ps.setString(3,provee.getDireccion());
            ps.setString(4,provee.getCorreo());
            ps.setString(5,provee.getTelefono());
            ps.setString(6,provee.getNotas());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }

    }
}
