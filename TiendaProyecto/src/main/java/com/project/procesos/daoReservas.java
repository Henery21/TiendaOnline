package com.project.procesos;
import java.sql.*;
import java.util.ArrayList;
import com.project.entidades.Reservas;

public class daoReservas {
    public ArrayList <Reservas> consultarReservas ( String Texto){
     ArrayList listaReservas =  new ArrayList();
        try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "select ID_Reserva,ID_Cliente,fechaInicio,fechaFin,estado,notas from Proveedores where ID_Cliente like ? or fechaFin like ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, "%"+Texto+"%");
            ps.setString(2, "%"+Texto+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Reservas reservas = new Reservas (rs.getInt(1), rs.getInt(2), rs.getString(3), 
                        rs.getString(4),rs.getString(5),rs.getString(6));
                listaReservas.add(reservas);
            }
            ps.close();
            conexion.desconectar();
            return listaReservas;
        } catch (SQLException e) {
            return null;
        }
 }       
 public int insertarReservas(Reservas reservas){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "insert into Reservas values (?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,reservas.getID_Reserva());
            ps.setInt(2,reservas.getID_Cliente());
            ps.setString(3,reservas.getFechaInicio());
            ps.setString(4,reservas.getFechaFin());
            ps.setString(5,reservas.getEstado());
            ps.setString(6,reservas.getNotas());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int modificarReservas(Reservas reservas){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "update Reservas set fechaInicio=?,fechaFin=?,notas=? where ID_Reserva=?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setInt(1,reservas.getID_Reserva());
            ps.setInt(2,reservas.getID_Cliente());
            ps.setString(3,reservas.getFechaInicio());
            ps.setString(4,reservas.getFechaFin());
            ps.setString(5,reservas.getEstado());
            ps.setString(6,reservas.getNotas());
            int res = ps.executeUpdate();
            ps.close();
            conexion.desconectar();
            return res;
        } catch (SQLException e) {
            return -1;
        }
    } public int eliminarReservas(int id){
    try {
            Conexion conexion = new Conexion();
            Connection con =  conexion.Conectar();
            String sql = "delete from Reservas where ID_Reserva=?";
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
