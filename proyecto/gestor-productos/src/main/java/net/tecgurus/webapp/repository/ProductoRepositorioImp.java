package net.tecgurus.webapp.repository;

import net.tecgurus.webapp.model.Producto;
import net.tecgurus.webapp.util.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImp implements Repositorio<Producto> {

    private Connection getConnection(){
        return ConexionBD.getIntance();
    }

    @Override
    public List<Producto> listar(){
        List<Producto> productos = new ArrayList<>();
        try(Statement statement = getConnection().createStatement()){
            String query = "SELECT * FROM productos";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                Producto producto = crearProducto(resultSet);
                productos.add(producto);
            }
        }catch (SQLException exception){
            System.out.println("\n\t (listar) Error: "+exception.getMessage());
        }
        return productos;
    }

    @Override
    public Producto buscarPorId(Integer id){
        Producto producto = null;
        String query = "SELECT * FROM productos WHERE id=?";
        try(PreparedStatement preparedStatement = getConnection().prepareStatement(query)){
            preparedStatement.setInt(1,id);
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if(resultSet.next()){
                    producto = crearProducto(resultSet);
                }
            }
        }catch (SQLException exception){
            System.out.println("\n\t (buscar por id) Error: "+exception.getMessage());
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto){
        String query;
        if(producto.getId()>0){
            query = "UPDATE productos SET nombre=?, precio=?, existencias=?, categoria=? WHERE id=?";
        }else {
            query = "INSERT INTO productos(nombre,precio,existencias,categoria) VALUES(?,?,?,?)";
        }

        try(PreparedStatement preparedStatement = getConnection().prepareStatement(query)){
            preparedStatement.setString(1,producto.getNombre());
            preparedStatement.setDouble(2,producto.getPrecio());
            preparedStatement.setInt(3,producto.getExistencias());
            preparedStatement.setString(4,producto.getCategoria());
            if(producto.getId()>0){
                preparedStatement.setInt(5,producto.getId());
            }
            preparedStatement.executeUpdate(); // Transacción
        }catch (SQLException exception){
            System.out.println("\n\t (guardar) Error: "+exception.getMessage());
        }
    }

    @Override
    public void eliminar(Integer id){
        String query = "DELETE FROM productos WHERE id=?";
        try(PreparedStatement preparedStatement = getConnection().prepareStatement(query)){
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate(); // Transacción
        }catch (SQLException exception){
            System.out.println("\n\t (eliminar) Error: "+exception.getMessage());
        }
    }

    private Producto crearProducto(ResultSet resultSet) throws SQLException{
        Producto producto = new Producto();
        producto.setId(resultSet.getInt("id"));
        producto.setNombre(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getDouble("precio"));
        producto.setExistencias(resultSet.getInt("existencias"));
        producto.setCategoria(resultSet.getString("categoria"));
        return producto;
    }



}
