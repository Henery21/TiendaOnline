package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Articulos;

public class daoArticulos {
    public ArrayList <Articulos> consultarArticulos ( String Texto){
     ArrayList listaArticulos =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Articulo,ID_Categoria,ID_Subcategoria,codigo,Precio_Venta,Fecha_Vencimiento, "
                    + "descripcion, estado, ID_Proveedor from Articulos where ID_Categoria like ? or Fecha_Vencimiento like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Articulos articulos = new Articulos (rs.getInt(1), rs.getInt(2), rs.getInt(3), 
                        rs.getString(4),rs.getDouble(5),rs.getString(6), rs.getString(7),rs.getInt(8),
                        rs.getInt(9));
                listaArticulos.add(articulos);
            }
            ps.close();
            conexion.desconectar();
            return listaArticulos;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarArticulos(Articulos articulos){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Articulos values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,articulos.getID_Articulo());
            ps.setInt(2,articulos.getID_Categoria());
            ps.setInt(3,articulos.getID_Subcategoria());
            ps.setString(4,articulos.getCodigo());
            ps.setDouble(5,articulos.getPrecio_Venta());
            ps.setString(6,articulos.getDescripcion());
            ps.setInt(7,articulos.getEstado());
            ps.setInt(8,articulos.getID_Proveedor());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarArticulos(Articulos articulos){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Articulos set ID_Categoria=?,ID_Subcategoria=?,estado=? where ID_Articulo=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,articulos.getID_Articulo());
            ps.setInt(2,articulos.getID_Categoria());
            ps.setInt(3,articulos.getID_Subcategoria());
            ps.setString(4,articulos.getCodigo());
            ps.setDouble(5,articulos.getPrecio_Venta());
            ps.setString(6,articulos.getDescripcion());
            ps.setInt(7,articulos.getEstado());
            ps.setInt(8,articulos.getID_Proveedor());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarArticulos(int id){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from Articulos where ID_Articulo=?";
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
