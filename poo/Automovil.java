public class Automovil {

    // Atributos:
    String marca;
    String modelo;
    double precio;

    // Constructor:
    Automovil(String marca,String modelo,double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Método personalizado:
    void mostrar(){
        System.out.printf(
                """
                    +--------AUTOMOVIL---------+
                    | Marca: %s
                    | Modelo: %s
                    | Precio: $ %.2f
                    +--------------------------+
                """,marca,modelo,precio
        );
    }

}
