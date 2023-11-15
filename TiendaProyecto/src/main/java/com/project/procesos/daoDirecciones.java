package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Direcciones;

public class daoDirecciones {
    public ArrayList <Direcciones> consultarDirecciones ( String Texto){
     ArrayList listaDirecciones =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Direccion,linea1,linea2,ID_Distrito,codigoPostal from Direcciones where linea1 like ? or linea2 like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Direcciones direcciones = new Direcciones (rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getInt(4),rs.getInt(5));
                listaDirecciones.add(direcciones);
            }
            ps.close();
            conexion.desconectar();
            return listaDirecciones;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarDirecciones(Direcciones direcciones){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Direcciones values (?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,direcciones.getID_Direccion());
            ps.setString(2,direcciones.getLinea1());
            ps.setString(3,direcciones.getLinea2());
            ps.setInt(4,direcciones.getID_Distrito());
            ps.setInt(5,direcciones.getCodigoPostal());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarDirecciones(Direcciones direcciones){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Direcciones set linea1=?,linea2=?,ID_Distrito=? where ID_Direccion=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,direcciones.getID_Direccion());
            ps.setString(2,direcciones.getLinea1());
            ps.setString(3,direcciones.getLinea2());
            ps.setInt(4,direcciones.getID_Distrito());
            ps.setInt(5,direcciones.getCodigoPostal());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarDirecciones(Direcciones direcciones){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from Direcciones where ID_Direccion=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,direcciones.getID_Direccion());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }

    }
}
