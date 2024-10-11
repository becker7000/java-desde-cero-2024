import java.util.Arrays;
import java.util.Scanner;

public class EstadisticaEdades {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] edades = new int[5];
        double promedio = 0;

        for(int i=0;i<edades.length;i++){
            System.out.print("\n\t Edad #"+(i+1)+": ");
            edades[i] = Integer.parseInt(entrada.nextLine());
            promedio+=edades[i];
        }

        promedio/=edades.length;
        System.out.printf("\n\t El promedio de las edades es: %.3f",promedio);
        System.out.println("\n\t Edades: "+ Arrays.toString(edades));

        System.out.print("\n\t Escribe una edad a buscar: ");
        int edad = Integer.parseInt(entrada.nextLine());
        boolean fueEncontrada = false;

        // Algoritmo de busqueda secuencial...
        for(int i=0;i<edades.length;i++){
            if(edad == edades[i]){
                System.out.print("\n\t EDAD ENCONTRADA");
                System.out.print("\n\t En la posición: "+i);
                fueEncontrada=true;
                break;
            }
        }

        if(!fueEncontrada){
            System.out.println("\n\t LA EDAD "+edad+" NO SE ENCUENTRA EN LA LISTA");
        }

        entrada.close();

    }

}
