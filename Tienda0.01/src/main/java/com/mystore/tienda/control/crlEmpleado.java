package com.mystore.tienda.control;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.mystore.tienda.operaciones.*;
import com.mystore.tienda.entidades.empleado;
import java.sql.*;
import java.util.ArrayList;

public class crlEmpleado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        daoEmpleado dEstudiante = new daoEmpleado();
        ArrayList<empleado> Lista = dEstudiante.consultarEstudiantes();
        request.setAttribute("Lista", Lista);
        request.getRequestDispatcher("empleados/consulta.jsp").forward(request, response);

    }
}
