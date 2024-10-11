package net.tecgurus.webapp.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.tecgurus.webapp.model.Producto;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet({"/productos","/productos-xls","/productos.html"})
public class ListaProductosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<Producto> productos = Arrays.asList(
                new Producto(1,"Coca-cola",30.49,10,"Refrescos"),
                new Producto(2,"Oreo",25.49,20,"Galletas"),
                new Producto(3,"Donas",22.0,10,"Pan"),
                new Producto(4,"Boing",18.9,12,"Jugos")
        );

        resp.setContentType("text/html;charset=UTF-8");

        // Obtenemos la lista de productos
        // Repositorio<Producto> productoRepositorio = new ProductoRepositorioImp();
        // List<Producto> productos = productoRepositorio.listar();

        // Código para importar a excel:
        String servletPath = req.getServletPath();
        boolean esExcel = servletPath.endsWith("-xls"); // Verdadero cuando termina con -xls

        if(esExcel){
            resp.setContentType("application/vnd.ms-excel");
            resp.setHeader("Content-Disposition","attachment;filename=listaProductos.xls");
        }

        try(PrintWriter salida = resp.getWriter()){

            if(!esExcel){
                salida.println("<!DOCTYPE html>");
                salida.println("<html>");
                salida.println("    <head>");
                salida.println("        <meta charset=\"UTF-8\">");
                salida.println("        <title>Lista de productos</title>");
                salida.println("    </head>");
                salida.println("    <body>");
                salida.println("        <h1> Listando productos </h1>");
                salida.println("        <a href=\""+req.getContextPath()+"/productos-xls\">Importar a excel</a>");
            }

            salida.println("    <table>");
            salida.println("        <tr>");
            salida.println("            <th>ID</th>");
            salida.println("            <th>Nombre</th>");
            salida.println("            <th>Precio</th>");
            salida.println("            <th>Existencias</th>");
            salida.println("            <th>Categoria</th>");
            salida.println("        </tr>");
            productos.forEach( producto -> {
                salida.println("    <tr>");
                salida.println("        <td>"+producto.getId()+"</td>");
                salida.println("        <td>"+producto.getNombre()+"</td>");
                salida.println("        <td>"+producto.getPrecio()+"</td>");
                salida.println("        <td>"+producto.getExistencias()+"</td>");
                salida.println("        <td>"+producto.getCategoria()+"</td>");
                salida.println("    </tr>");
            });
            salida.println("    </table>");

            if(!esExcel){
                salida.println("    </body>");
                salida.println("<html>");
            }

        }

    }
}
