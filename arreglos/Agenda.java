import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();

        int opcion = 0;
        int idGlobal = 1;

        while(opcion!=5){

            System.out.print(
                    """
                    
                        +-------MENÚ DE LA AGENDA-------+
                        | 1. Agregar un contacto        |
                        | 2. Ver lista de contactos     |
                        | 3. Modificar un contacto      |
                        | 4. Eliminar un contacto       |
                        | 5. Salir de la agenda         |
                        +-------------------------------+
                    """
            );
            do{
                System.out.print("\n\t Opción> ");
                opcion = Integer.parseInt(entrada.nextLine());
            }while(opcion<1 || opcion>5);

            switch (opcion){
                case 1 -> {
                    System.out.println("\n\t AGREGANDO UN CONTACTO");
                    Contacto contacto = new Contacto();
                    contacto.setId(idGlobal);
                    idGlobal++;
                    System.out.print("\n\t Nombre: ");
                    contacto.setNombre(entrada.nextLine());
                    System.out.print("\n\t Teléfono: ");
                    contacto.setTelefono(entrada.nextLine());
                    contactos.add(contacto);
                    System.out.println("\n\t CONTACTO AGREGADO CORRECTAMENTE");
                    contacto.mostrarContacto();
                }
                case 2 -> {
                    System.out.println("\n\t LISTANDO CONTACTOS");
                    if(contactos.isEmpty()){
                        System.out.println("\n\t La agenda de contactos está vacía...");
                    }else{
                        for(Contacto contacto : contactos){
                            contacto.mostrarContacto();
                        }
                    }
                }
                case 3 -> {
                    System.out.println("\n\t MODIFICANDO UN CONTACTO");
                    System.out.print("\n\t Escribe el id: ");
                    int idContacto = Integer.parseInt(entrada.nextLine());
                    boolean fueEncontrado = false;
                    for(Contacto contacto:contactos){
                        if(idContacto == contacto.getId()){
                            System.out.print("\n\t Contacto encontrado");
                            contacto.mostrarContacto();
                            System.out.print("\n\t Nuevo nombre: ");
                            contacto.setNombre(entrada.nextLine());
                            System.out.print("\n\t Nuevo teléfono: ");
                            contacto.setTelefono(entrada.nextLine());
                            System.out.println("\n\t CONTACTO MODIFICADO CORRECTAMENTE");
                            contacto.mostrarContacto();
                            fueEncontrado=true;
                            break;
                        }
                    }
                    if(!fueEncontrado){
                        System.out.printf("\n\t EL CONTACTO CON ID: %d, NO EXISTE EN LA AGENDA\n",idContacto);
                    }
                }
                case 4 -> {
                    System.out.println("\n\t ELIMINANDO UN CONTACTO");
                    System.out.print("\n\t Escribe el id del contacto a eliminar: ");
                    int idEliminar = Integer.parseInt(entrada.nextLine());
                    boolean esPresente = false;
                    for(Contacto contacto : contactos){
                        if(idEliminar == contacto.getId()){
                            System.out.println("\n\t Contacto encontrado");
                            contacto.mostrarContacto();
                            contactos.remove(contacto);
                            System.out.println("\n\t CONTACTO ELIMINADO CORRECTAMENTE");
                            esPresente=true;
                            break;
                        }
                    }
                    if(!esPresente){
                        System.out.printf("\n\t EL CONTACTO CON ID: %d, NO ESTA PRESENTE EN LA AGENDA",idEliminar);
                    }
                }
                case 5 -> {
                    System.out.print("\n\t SALIENDO DE LA AGENDA");
                    System.out.println("\n\t TODOS LOS CONTACTOS SE BORRARÁN");
                }
            }

            System.out.println("\n\t DA [ENTER] PARA CONTINUAR");
            entrada.nextLine();

        }

        entrada.close();

    }

}
