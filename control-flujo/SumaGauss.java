import java.util.Scanner;

public class SumaGauss {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int suma = 0;
        int maximo;

        System.out.print("\n\t Sumar del 1 al: ");
        maximo = Integer.parseInt(entrada.nextLine());

        while(contador<=maximo){
            suma+=contador;
            contador++;
        }

        System.out.printf("\n\t La suma del 1 al %d es %d",maximo,suma);

        entrada.close();

    }

}

/*
*  Solicitar al usuario un número entero (Ejemplo 7)
*  Entonces usando while mostrar la tabla de multiplicar.
*  Termina: 8:08 PM
* */