import java.util.Scanner;

public class MenuSwitch {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.print(
                """
                    +------------------------------+
                    | Menú                         |
                    | 1. Listar los productos      |
                    | 2. Buscar un producto        |
                    | 3. Crear un producto         |
                    | 4. Modificar un producto     |
                    | 5. Eliminar un producto      |
                    | 6. Salir                     |
                    +------------------------------+
                """
        );
        System.out.print("\n\t Opción> ");
        opcion = Integer.parseInt(entrada.nextLine());

        // Switch tradicional
        switch(opcion){
            case 1:
                System.out.println("\n\t LISTANDO LOS PRODUCTOS...");
                break;
            case 2:
                System.out.println("\n\t BUSCANDO UN PRODUCTO...");
                break;
            case 3:
                System.out.println("\n\t CREANDO UN PRODUCTO...");
                break;
            case 4:
                System.out.println("\n\t MODIFICANDO UN PRODUCTO...");
                break;
            case 5:
                System.out.println("\n\t ELIMINANDO UN PRODUCTO...");
                break;
            case 6:
                System.out.println("\n\t SALIENDO DEL GESTOR DE PRODUCTOS...");
                break;
            default:
                System.out.println("\n\t OPCIÓN NO CONTEMPLADA...");
                break;
        }

        entrada.close();

    }

}
