package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Carrito;

public class daoCarrito {
    public ArrayList <Carrito> consultarCarrito ( String Texto){
     ArrayList listaCarrito =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Carrito,ID_Cliente,fecha,ID_Articulo,cantidad,precio from CarritoCompras where ID_Cliente like ? or fecha like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Carrito carrito = new Carrito (rs.getInt(1), rs.getInt(2), rs.getString(3), 
                        rs.getInt(4),rs.getInt(5),rs.getDouble(6));
                listaCarrito.add(carrito);
            }
            ps.close();
            conexion.desconectar();
            return listaCarrito;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarCarrito(Carrito carrito){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into CarritoCompras values (?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,carrito.getID_Carrito());
            ps.setInt(2,carrito.getID_Cliente());
            ps.setString(3,carrito.getFecha());
            ps.setInt(4,carrito.getID_Articulo());
            ps.setInt(5,carrito.getCantidad());
            ps.setDouble(6,carrito.getPrecio());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarCarrito(Carrito carrito){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update CarritoCompras set fecha=?,cantidad=?,precio=? where ID_Carrito=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,carrito.getID_Carrito());
            ps.setInt(2,carrito.getID_Cliente());
            ps.setString(3,carrito.getFecha());
            ps.setInt(4,carrito.getID_Articulo());
            ps.setInt(5,carrito.getCantidad());
            ps.setDouble(6,carrito.getPrecio());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarCarrito(int id) {
    try {
        Conexion conexion = new Conexion();
        Connection con = conexion.Conectar();
        String sql = "delete from CarritoCompras where ID_Carrito=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);  // Utiliza directamente el parámetro id
        int res = ps.executeUpdate();
        ps.close();
        conexion.desconectar();
        return res;
    } catch (SQLException e) {
        return -1;
    }
}

}
