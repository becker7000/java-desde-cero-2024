package net.tecgurus.webapp;

import net.tecgurus.webapp.model.Producto;
import net.tecgurus.webapp.repository.ProductoRepositorioImp;
import net.tecgurus.webapp.repository.Repositorio;
import net.tecgurus.webapp.util.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductoTest {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        try(Connection connection = ConexionBD.getIntance()){

            Repositorio<Producto> productoRepositorio = new ProductoRepositorioImp();

            while(opcion!=6){

                System.out.print(
                        """
                        
                            +-------------------------------+
                            | Gestor de productos           |
                            | 1. Ver productos              |
                            | 2. Buscar por id              |
                            | 3. Crear un producto          |
                            | 4. Modificar un producto      |
                            | 5. Eliminar un producto       |
                            | 6. Salir del gestor           |
                            +-------------------------------+
                        """
                );

                do{ // Filtro
                    System.out.print("\n\t Opción> ");
                    opcion = Integer.parseInt(entrada.nextLine());
                }while(opcion<1 || opcion>6);

                switch (opcion){
                    case 1 -> {
                        System.out.println("\n\t ------------ LISTANDO PRODUCTOS ------------");
                        productoRepositorio.listar().forEach(Producto::mostrar);
                    }
                    case 2 -> {
                        System.out.println("\n\t ------------ BUSCANDO POR ID ------------");
                        System.out.print("\n\t Escribe el id a buscar: ");
                        try{
                            Producto prod =  productoRepositorio.buscarPorId(Integer.parseInt(entrada.nextLine()));
                            System.out.println("\n\t PRODUCTO ENCONTRADO...");
                            prod.mostrar();
                        }catch (NullPointerException exception){
                            System.out.print("\n\t PRODUCTO NO ENCONTRADO...");
                            System.out.println("\n\t (caso 2) Error: "+exception.getMessage());
                        }
                    }
                    case 3 -> {
                        System.out.println("\n\t ------------ CREANDO UN PRODUCTO ------------");
                        Producto producto = new Producto();
                        System.out.print("\n\t Nombre: ");
                        producto.setNombre(entrada.nextLine());
                        System.out.print("\n\t Precio: ");
                        producto.setPrecio(Double.parseDouble(entrada.nextLine()));
                        System.out.print("\n\t Existencias: ");
                        producto.setExistencias(Integer.parseInt(entrada.nextLine()));
                        System.out.print("\n\t Categoria: ");
                        producto.setCategoria(entrada.nextLine());
                        productoRepositorio.guardar(producto); // Nuevo producto
                        System.out.println("\n\t PRODUCTO GUARDADO CORRECTAMENTE");
                    }
                    case 4 -> {
                        System.out.println("\n\t ------------ MODIFICANDO UN PRODUCTO ------------");
                        Producto producto = new Producto(); // Un DTO
                        System.out.print("\n\t Id: ");
                        producto.setId(Integer.parseInt(entrada.nextLine()));
                        System.out.print("\n\t Nuevo nombre: ");
                        producto.setNombre(entrada.nextLine());
                        System.out.print("\n\t Nuevo precio: $ ");
                        producto.setPrecio(Double.parseDouble(entrada.nextLine()));
                        System.out.print("\n\t Nuevas existencias: ");
                        producto.setExistencias(Integer.parseInt(entrada.nextLine()));
                        System.out.print("\n\t Nueva categoria: ");
                        producto.setCategoria(entrada.nextLine());
                        productoRepositorio.guardar(producto);
                        System.out.println("\n\t PRODUCTO MODIFICADO CORRECTAMENTE");
                    }
                    case 5 -> {
                        System.out.println("\n\t ------------ ELIMINANDO UN PRODUCTO ------------");
                        System.out.print("\n\t Escribe el id del producto a eliminar: ");
                        productoRepositorio.eliminar(Integer.parseInt(entrada.nextLine()));
                        System.out.println("\n\t PRODUCTO ELIMINADO CORRECTAMENTE");
                    }
                    case 6 -> {
                        System.out.println("\n\t ------------ SALIENDO DEL GESTOR DE PRODUCTOS ------------");
                    }
                }

                System.out.println("\n\n\t DA [ENTER] PARA CONTINUAR");
                entrada.nextLine();

            }

        } catch (SQLException exception) {
            System.out.println("\n\t ERROR EN EL TEST DE PRODUCTOS");
        }

        entrada.close();

    }

}
