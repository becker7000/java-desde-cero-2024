import java.util.Scanner;

public class Cadenas1 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;

        System.out.print("\n\t Escribe tu nombre: ");
        nombre = entrada.nextLine();

        System.out.print("\n\t Escribe tu apellido: ");
        apellido = entrada.nextLine();

        System.out.println("\n\t Hola "+nombre+" "+apellido);

        System.out.printf("\n\t Tu nombre tiene %d letras",nombre.length());
        System.out.printf("\n\t La inicial de tu nombre es %c",nombre.charAt(0));
        System.out.printf("\n\t La ultima letra de tu apellido es: %c",apellido.charAt(apellido.length()-1));

        System.out.println("\n");
        entrada.close();

    }

}

/*

    String mensaje = "Hola";

    H   o   l   a
    0   1   2   3

 */