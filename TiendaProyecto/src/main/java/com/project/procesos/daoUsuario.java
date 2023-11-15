package com.project.procesos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.project.utilerias.Hash;
import java.sql.ResultSet;

public class daoUsuario {
    public boolean validarCredenciales(String usuario, String clave){
        try {
            Conexion conexion = new Conexion();
            Connection con = conexion.Conectar();
            String sql = "select ID_Usuario,usuario,clave,ID_Rol from Usuarios"
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
