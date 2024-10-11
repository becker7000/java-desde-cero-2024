import java.util.Scanner;

public class TernarioTest2 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int horas;
        int categoria; // 1,2,3

        System.out.print("\n\t Escribe tus horas: ");
        horas = Integer.parseInt(entrada.nextLine());

        categoria = horas<=10 ? 1 :
                    horas<=20 ? 2 : 3;

        System.out.printf("\n\t Tu categoria es: %d \n",categoria);

        entrada.close();

    }

}

/*
    horas<=10,entonces cat 1
    10<horas<=20, entonces cat 2
    horas > 20, entonces cat 3
 */
