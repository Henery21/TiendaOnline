
package com.mystore.tienda.operaciones;
import java.sql.*;
import com.mystore.tienda.utilerias.Hash;
public class daoUSuario {
     public boolean validarCredenciales(String usuario, String clave){
        try {
            Conexion conexion = new Conexion();
            Connection con = conexion.Conectar();
            String sql = "select usuario,idrol from usuario"
                    + " where usuario = ? and clave = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, Hash.generarHash(clave, Hash.SHA256));
            ResultSet rs = pst.executeQuery();
            while (rs.next())
                return true;
            
            con.close();
            return false;
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
            return false;
        }        
    }
}
