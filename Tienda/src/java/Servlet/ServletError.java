/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;


import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletError extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer codigoEstado = (Integer) request.getAttribute("Jakarta.servlet.error.status_code");
        String nombreServlet = (String) request.getAttribute("Jakarta.servlet.error.servlet_name");
        String peticionUrl = (String) request.getAttribute("Jakarta.servlet.error.request_url");

        String paginaError = "/Error500.html"; // Página de error por defecto

        if (codigoEstado != null) {
            if (codigoEstado == 404) {
                paginaError = "/Error404.html";
            } else if (codigoEstado == 500) {
                paginaError = "/Error500.html";
            }
        }

        request.getRequestDispatcher(paginaError).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Puedes implementar el manejo de errores para el método POST si es necesario
    }
}
