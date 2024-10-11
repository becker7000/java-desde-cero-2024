import java.util.Scanner;

public class CalculadoraIVA {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double monto_sin_iva;
        double monto_con_iva;

        System.out.print("\n\t Escribe un monto sin IVA: $ ");
        monto_sin_iva = Double.parseDouble(entrada.nextLine());

        monto_con_iva = monto_sin_iva*1.16;

        System.out.printf("\n\t El monto con IVA es: $ %.2f",monto_con_iva);

        entrada.close();

    }

}
