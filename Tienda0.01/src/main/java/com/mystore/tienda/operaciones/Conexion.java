package com.mystore.tienda.operaciones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=TiendaLacteos;encrypt=true;trustServerCertificate=true";
    private static final String USUARIO = "login_admin";
    private static final String CONTRASEÑA = "root";
    private Connection conexion;

    public synchronized Connection Conectar() {
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
                System.out.println("Conexión exitosa");
            }
            return conexion;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error en la conexión: " + e.toString());
            return null;
        }
    }

    public synchronized void desconectar() {
        try {
            if (conexion != null) {
                conexion.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.toString());
        }
    }
}
