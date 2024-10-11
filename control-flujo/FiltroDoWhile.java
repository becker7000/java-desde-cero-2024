import java.util.Scanner;

public class FiltroDoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do{
            System.out.print("\n\t Escribe un entero entre 1 y 5: ");
            opcion = Integer.parseInt(entrada.nextLine());
        }while(opcion<1 || opcion>5);

        System.out.println("\n\t Opción válida...");

        entrada.close();

    }

}
