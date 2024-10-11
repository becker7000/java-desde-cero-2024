import java.util.Scanner;

public class ConversorTiempo {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int segundos;
        int minutos;

        System.out.print("\n\t Escribe los segundos: ");
        segundos = Integer.parseInt(entrada.nextLine());

        System.out.printf("\n\t %d segundos equivalen a",segundos);

        minutos = segundos/60;
        segundos = segundos%60;

        System.out.printf("\n\t %d minutos con %d segundos",minutos,segundos);

        entrada.close();

    }

}
