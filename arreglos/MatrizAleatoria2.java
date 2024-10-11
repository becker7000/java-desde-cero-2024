import java.util.Random;
import java.util.Scanner;

public class MatrizAleatoria2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("\n\t Escribe el valor de n: ");
        n = Integer.parseInt(entrada.nextLine());

        // Se genera una matriz cuadrada:
        int[][] matriz = new int[n][n];

        // Creando un objeto de la clase Random
        Random aleatorio = new Random();

        // Generamos la matriz aleatoria
        for(int i=0;i<matriz.length;i++){ // Obtener el número de filas
            System.out.println("\n");
            for(int j=0;j<matriz[i].length;j++){ // Obtener el número de columnas
                matriz[i][j] = aleatorio.nextInt(10,31);
                System.out.print("\t "+matriz[i][j]);
            }
        }

        entrada.close();

    }

}
