package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Subcategorias;

public class daoSubcategorias {
    public ArrayList <Subcategorias> consultarSubcategorias ( String Texto){
     ArrayList listaSubcategorias =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Subcategoria,subcategoria, ID_Categoria from Subcategorias where subcategoria like ? or ID_Categoria like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Subcategorias subcategorias = new Subcategorias (rs.getInt(1),
                        rs.getString(2), rs.getInt(3));
                listaSubcategorias.add(subcategorias);
            }
            ps.close();
            conexion.desconectar();
            return listaSubcategorias;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarSubcategorias(Subcategorias subcategorias){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Subcategorias values (?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,subcategorias.getID_Subcategoria());
            ps.setString(2,subcategorias.getSubcategoria());
            ps.setInt(3,subcategorias.getID_Categoria());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarSubcategorias(Subcategorias subcategorias){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Subcategorias set subcategoria=?,ID_Categoria=? where ID_Subcategoria=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,subcategorias.getID_Subcategoria());
            ps.setString(2,subcategorias.getSubcategoria());
            ps.setInt(3,subcategorias.getID_Categoria());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarSubcategorias(int id){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from Subcategorias where ID_Subcategoria=?";
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
