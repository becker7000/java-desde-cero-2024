import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        int cantidad;

        System.out.print("\n\t Cuantos números? => ");
        cantidad = Integer.parseInt(entrada.nextLine());

        // Agregamos todos los valores desde el teclado:
        for(int i=0;i<cantidad;i++){
            System.out.printf("\n\t Elem[%d]: ",i);
            Double numero = Double.parseDouble(entrada.nextLine());
            numeros.add(numero);
        }

        System.out.print("\n\t Números: "+numeros);

        // Algoritmo para encontrar el menor elemento:
        Double menor = numeros.get(0);
        for(Double numero : numeros){
            if(numero < menor){
                menor = numero;
            }
        }
        System.out.println("\n\t El número menor es: "+menor);

        entrada.close();

    }

}
