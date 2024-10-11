import java.util.Scanner;

public class VocalesSwitch {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.print("\n\t Escribe una letra: ");
        letra = entrada.nextLine().charAt(0);

        switch (letra){
            case 'a':
            case 'A':
                System.out.println("\n\t PRIMERA VOCAL...");
                break;
            case 'e':
            case 'E':
                System.out.println("\n\t SEGUNDA VOCAL...");
                break;
            case 'i':
            case 'I':
                System.out.println("\n\t TERCERA VOCAL...");
                break;
            case 'o':
            case 'O':
                System.out.println("\n\t CUARTAA VOCAL...");
                break;
            case 'u':
            case 'U':
                System.out.println("\n\t QUINTA VOCAL...");
                break;
            default:
                System.out.println("\n\t NINGUNA VOCAL...");
                break;
        }

        entrada.close();

    }

}
