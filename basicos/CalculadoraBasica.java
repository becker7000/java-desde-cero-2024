import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int x;
        int y;

        System.out.print("\n\t Escribe el valor de x: ");
        x = Integer.parseInt(entrada.nextLine());

        System.out.print("\n\t Escribe el valor de y: ");
        y = Integer.parseInt(entrada.nextLine());

        System.out.printf("\n\t %d + %d = %d",x,y,x+y);
        System.out.printf("\n\t %d - %d = %d",x,y,x-y);
        System.out.printf("\n\t %d * %d = %d",x,y,x*y);
        System.out.printf("\n\t %d / %d = %d",x,y,x/y);

    }

}
