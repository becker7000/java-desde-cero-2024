import java.util.Scanner;

public class Multiplo7 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int entero;

        System.out.print("\n\t Escribe un número entero: ");
        entero = Integer.parseInt(entrada.nextLine());

        if(entero%7==0){
            System.out.println("\n\t El entero es múltiplo de 7");
        }else{
            System.out.println("\n\t El entero NO es múltiplo de 7");
        }

        entrada.close();

    }

}

// ...,-28,-21,-14,-7,0,7,14,21,28,35,...
// 7/7=1 -> resta 0
// 14/7=2 -> resta 0
