import java.util.Scanner;

public class If2 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int a;
        int b;

        System.out.print("\n\t Escribe un entero: ");
        a = Integer.parseInt(entrada.nextLine());

        System.out.print("\n\t Escribe otro entero: ");
        b = Integer.parseInt(entrada.nextLine());

        if(a>b){
            System.out.print("\n\t El mayor es: "+a);
        }

        if(a<b){
            System.out.print("\n\t El mayor es: "+b);
        }

        if(a==b){
            System.out.print("\n\t Son iguales...");
        }

        entrada.close();

    }

}
