import java.util.Scanner;

public class DistanciaLetra {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("\n\t Escribe una letra en minúscula: ");
        letra = entrada.nextLine().charAt(0);

        int distancia = 'z'-letra;

        System.out.printf("\n\t La letra %c esta a %d letras de distancia de 'z'",letra,distancia);

        entrada.close();

    }

}
