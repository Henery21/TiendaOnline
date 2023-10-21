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
        daoEmpleado dEmpleado = new daoEmpleado();
        ArrayList<empleado> Lista = dEmpleado.consultarEmpleado(LEGACY_DO_HEAD);
        request.getRequestDispatcher("jsp/consulta.jsp").forward(request, response);

    }
}
