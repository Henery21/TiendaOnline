package com.project.control;

import com.project.entidades.Usuario;
import com.project.procesos.daoUsuario;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class contUsuario extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        daoUsuario dao = new daoUsuario();
        ArrayList<Usuario> listaUsuarios = dao.consultarUsuarios(LEGACY_DO_HEAD);
        request.getRequestDispatcher("MostrarUsuario.jsp").forward(request, response);
        }
    
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener parámetros del formulario de inicio de sesión
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        // Validar credenciales utilizando el daoUsuario
        daoUsuario dao = new daoUsuario();
        boolean credencialesValidas = dao.validarCredenciales(usuario, clave);

        if (credencialesValidas) {
            // Credenciales válidas, redirigir a la página de inicio o hacer otras acciones
            response.sendRedirect("index.jsp");
        } else {
            // Credenciales inválidas, mostrar mensaje de error
            request.setAttribute("mensajeError", "Usuario o contraseña incorrectos");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
