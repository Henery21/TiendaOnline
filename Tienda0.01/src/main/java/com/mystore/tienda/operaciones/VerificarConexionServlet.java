package com.mystore.tienda.operaciones;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/VerificarConexionServlet")
public class VerificarConexionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Conexion conexion = new Conexion();
        Connection dbConnection = conexion.Conectar();

        if (dbConnection != null) {
            request.setAttribute("conexionExitosa", true);
        } else {
            request.setAttribute("conexionExitosa", false);
        }

        request.getRequestDispatcher("/verificarConexion.jsp").forward(request, response);
    }
}
