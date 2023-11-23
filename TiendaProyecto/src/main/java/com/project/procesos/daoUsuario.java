package com.project.procesos;

import com.project.entidades.Usuario;
import com.project.utilerias.Hash;
import java.sql.*;
import java.util.ArrayList;

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
    public ArrayList <Usuario> consultarUsuarios ( String Texto){
     ArrayList listaUsuarios =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql ="select ID_Usuario,usuario,clave,ID_Rol from Usuarios"
                    + " where usuario = ? and clave = ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Usuario usuario = new Usuario (rs.getInt(1), rs.getString(2), 
                        rs.getString(3), rs.getInt(4));
                listaUsuarios.add(usuario);
            }
            ps.close();
            conexion.desconectar();
            return listaUsuarios;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarUsuarios(Usuario usuario){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Usuarios values (?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,usuario.getID_Usuario());
            ps.setString(2,usuario.getUsuario());
            ps.setString(3,usuario.getClave());
            ps.setInt(4,usuario.getID_Rol());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarUsuarios(Usuario usuario){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Usuarios set usuario=?,clave=?,ID_Rol=? where ID_Usuario=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,usuario.getID_Usuario());
            ps.setString(2,usuario.getUsuario());
            ps.setString(3,usuario.getClave());
            ps.setInt(4,usuario.getID_Rol());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarUsuarios(int id){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from Usuarios where ID_Usuario=?";
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
