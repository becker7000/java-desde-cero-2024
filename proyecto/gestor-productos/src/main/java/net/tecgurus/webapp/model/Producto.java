package net.tecgurus.webapp.model;

public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int existencias;
    private String categoria;

    public Producto(){

    }

    public Producto(int id,String nombre,double precio,int existencias,String categoria){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
        this.categoria = categoria;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public int getExistencias(){
        return existencias;
    }

    public void setExistencias(int existencias){
        this.existencias = existencias;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void mostrar(){
        System.out.printf("\n\t -> %d %s $%.2f %d %s",id,nombre,precio,existencias,categoria);
    }

}
