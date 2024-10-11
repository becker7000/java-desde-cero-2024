import java.util.Scanner;

public class Triangulo {

    // int niveles; // Alcance global

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int niveles;
        int i=1;

        System.out.print("\n\t Escribe el número de niveles: ");
        niveles = Integer.parseInt(entrada.nextLine());

        while(i<=niveles){
            int j = 0; // Variable local al bloque de while
            System.out.println("\n");
            while(j<i){
                System.out.print("\t *");
                j++;
            }
            i++;
        }

        entrada.close();

    }

}

/*
    Número de niveles: 3

    *
    *  *
    *  *  *

*/
