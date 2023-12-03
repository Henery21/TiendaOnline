package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Empleados;

public class daoEmpleados {
    public ArrayList <Empleados> consultarEmpleados ( String Texto){
     ArrayList listaEmpleados =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Empleado,DUI_Empleado,nombresEmpleado,apellidosEmpleado,ID_Usuario,telefono,correo, direccion,ID_Cargo from Empleados where nombresEmpleado like ? or correo like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Empleados empleados = new Empleados (rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4),rs.getInt(5),rs.getDate(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getInt(10));
                listaEmpleados.add(empleados);
            }
            ps.close();
            conexion.desconectar();
            return listaEmpleados;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarEmpleados(Empleados Empleado){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Empleados values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,Empleado.getID_Empleado());
            ps.setString(2,Empleado.getDUI_Empleado());
            ps.setString(3,Empleado.getNombresEmpleado());
            ps.setString(4,Empleado.getApellidosEmpleado());
            ps.setInt(5,Empleado.getID_Usuario());
            ps.setDate(6, (Date) Empleado.getFechaNacEmpleado());
            ps.setString(7,Empleado.getCorreo());
            ps.setString(8,Empleado.getTelefono());
            ps.setString(9,Empleado.getDireccion());
            ps.setInt(10,Empleado.getID_Cargo());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarEmpleados(Empleados Empleado){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Empleados set nombresEmpleado=?,correo=?,telefono=? where ID_Empleado=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,Empleado.getID_Empleado());
            ps.setString(2,Empleado.getDUI_Empleado());
            ps.setString(3,Empleado.getNombresEmpleado());
            ps.setString(4,Empleado.getApellidosEmpleado());
            ps.setInt(5,Empleado.getID_Usuario());
            ps.setDate(6, (Date) Empleado.getFechaNacEmpleado());
            ps.setString(7,Empleado.getCorreo());
            ps.setString(8,Empleado.getTelefono());
            ps.setString(9,Empleado.getDireccion());
            ps.setInt(10,Empleado.getID_Cargo());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarEmpleados(int id) {
    try {
        Conexion conexion = new Conexion();
        Connection con = conexion.Conectar();
        String sql = "delete from Empleados where ID_Empleado=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        int res = ps.executeUpdate();
        ps.close();
        conexion.desconectar();
        return res;
    } catch (SQLException e) {
        return -1;
    }
    }
}
