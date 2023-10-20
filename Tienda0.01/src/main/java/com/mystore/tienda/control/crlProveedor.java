package com.mystore.tienda.control;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.mystore.tienda.entidades.*;
import com.mystore.tienda.operaciones.daoProveedor;

import java.util.ArrayList;

public class crlProveedor extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        daoProveedor dProveedor = new daoProveedor();
        ArrayList<proveedores> Lista = dProveedor.consultarProveedor(LEGACY_DO_HEAD);
        request.setAttribute("Lista", Lista);
        request.getRequestDispatcher("empleados/consultaE.jsp").forward(request, response);//Agregar Direccion donde se encuentre el jsp 
        

    }
}
