import java.util.Scanner;

public class MatrizAleatoria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("\n\t Escribe el valor de n: ");
        n = Integer.parseInt(entrada.nextLine());

        for(int i=0; i<n; i++){ // Filas
            System.out.println("\n");
            for(int j=0; j<n; j++){ // Columnas
                System.out.printf("\t %d",(int)(Math.random()*41)+10);
            }
        }

        entrada.close();

    }

}
