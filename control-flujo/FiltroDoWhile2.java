import java.util.Scanner;

public class FiltroDoWhile2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entero;

        do{
            System.out.print("\n\t Escribe alguno del los enteros 1,2,3,7,8 o 9: ");
            entero = Integer.parseInt(entrada.nextLine());
        }while (entero<1 || entero>3 && entero<7 || entero>9);

        System.out.println("\n\t Número aceptado...");

        entrada.close();

    }

}
