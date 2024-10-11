package net.tecgurus.webapp.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet("/hola")
public class HolaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        LocalDate localDate = LocalDate.now();

        resp.setContentType("text/html");
        PrintWriter salida = resp.getWriter();

        // Generamos el código html:
        salida.println("<!DOCTYPE html>");
        salida.println("<html>");
        salida.println("<head>");
        salida.println("    <meta charset=\"UTF-8\">");
        salida.println("    <title>Hola Servlet</title>");
        salida.println("</head>");
        salida.println("<body>");
        salida.println("    <h2>Hola a todos desde un Servlet...</h2>");
        salida.println("    <h3>"+localDate+"</h3>");
        salida.println("</body>");
        salida.println("</html>");

    }

}
