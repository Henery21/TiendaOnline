package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Categorias;

public class daoCategorias {
    public ArrayList <Categorias> consultarCategorias ( String Texto){
     ArrayList listaCategorias =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Categoria,nombre, descripcion, bit from Categorias where nombre like ? or ID_Categoria like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Categorias categorias = new Categorias (rs.getInt(1),
                        rs.getString(2), rs.getString(3), rs.getInt(4));
                listaCategorias.add(categorias);
            }
            ps.close();
            conexion.desconectar();
            return listaCategorias;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarCategorias(Categorias categorias){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Categorias values (?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,categorias.getID_Categoria());
            ps.setString(2,categorias.getNombre());
            ps.setString(3,categorias.getDescripcion());
            ps.setInt(4,categorias.getBit());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarCategorias(Categorias categorias){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Categorias set nombre=?,descripcion=?,bit=? where ID_Categoria=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,categorias.getID_Categoria());
            ps.setString(2,categorias.getNombre());
            ps.setString(3,categorias.getDescripcion());
            ps.setInt(4,categorias.getBit());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarCategorias(Categorias categorias){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from Categorias where ID_Categoria=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,categorias.getID_Categoria());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }

    }
}
