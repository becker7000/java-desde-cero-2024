import java.util.Scanner;

public class Vocales {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("\n\t Escribe una vocal: ");
        letra = entrada.nextLine().charAt(0);

        if(letra=='a' || letra=='A'){
            System.out.println("\n\t Primera vocal...");
        }else if(letra=='e' || letra=='E'){
            System.out.println("\n\t Segunda vocal...");
        }else if(letra=='i' || letra=='I'){
            System.out.println("\n\t Tercera vocal...");
        }else if(letra=='o' || letra=='O'){
            System.out.println("\n\t Cuarta vocal...");
        }else if(letra=='u' || letra=='U'){
            System.out.println("\n\t Quinta vocal...");
        }else{
            System.out.println("\n\t El caracter no es ninguna vocal en minúscula...");
        }

        entrada.close();

    }

}
