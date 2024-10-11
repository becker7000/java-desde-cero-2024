import java.util.Scanner;

public class Rangos1 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int entero;

        System.out.print("\n\t Escribe un número entero: ");
        entero = Integer.parseInt(entrada.nextLine());

        if(entero>=2 && entero<=5){
            System.out.println("\n\t DENTRO DEL RANGO...");
        }else{
            System.out.println("\n\t FUERA DEL RANGO...");
        }

        entrada.close();

    }

}
