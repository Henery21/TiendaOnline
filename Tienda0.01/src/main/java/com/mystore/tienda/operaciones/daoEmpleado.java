
package com.mystore.tienda.operaciones;
import java.sql.*;
import com.mystore.tienda.entidades.empleado;
import java.util.ArrayList;

public class daoEmpleado {
 public ArrayList <empleado> consultar (String Texto){
     ArrayList lista =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Empleado,NombresEmpleado,ApellidosEmpleado,Telefono,Correo,ID_Cargo from  TiendaLacteos.dbo.Empleados where nombre like ? or correo like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                empleado contacto = new empleado (rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4),rs.getString(5),rs.getInt(6));
                lista.add(contacto);
            }
            ps.close();
            conexion.desconectar();
            return lista;
        } catch (SQLException e) {
            return null;
        }
 }    
}
