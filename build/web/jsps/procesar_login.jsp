<%@page import="java.sql.*"%>
<%@page import="javax.servlet.http.*"%>

<%
    String usuario = request.getParameter("usuario");
    String contrasena = request.getParameter("contrasena");

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
<!--aqui hay que agregar el JDBC De SQlSERVER -->
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base_de_datos", "tu_usuario", "tu_contrasena");

            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);
            response.sendRedirect("pagina_principal.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
        stmt = conn.createStatement();
        String sql = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "' AND contrasena = '" + contrasena + "'";
        rs = stmt.executeQuery(sql);

        if (rs.next()) {
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (stmt != null) try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
%>
