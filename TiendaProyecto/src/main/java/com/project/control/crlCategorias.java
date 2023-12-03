package com.project.control;

import com.project.entidades.Categorias;
import com.project.procesos.daoCategorias;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class crlCategorias extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        daoCategorias dCat = new daoCategorias();
        ArrayList<Categorias> Lista = dCat.consultarCategorias(LEGACY_DO_HEAD);
        request.getRequestDispatcher("MostrarCategorias.jsp").forward(request, response);
        }
    }