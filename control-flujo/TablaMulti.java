import java.util.Scanner;

public class TablaMulti {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int entero;
        int i = 1;

        System.out.print("\n\t Mostrar la tabla del: ");
        entero = Integer.parseInt(entrada.nextLine());

        while(i<=10){
            System.out.printf("\n\t %d * %d = %d",entero,i,entero*i);
            i++;
        }

        entrada.close();

    }

}
