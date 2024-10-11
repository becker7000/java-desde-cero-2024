import java.util.Scanner;

public class CalculadoraDesc {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double montoSinDesc;
        double montoConDesc;

        System.out.print("\n\t Escribe un monto: $ ");
        montoSinDesc = Double.parseDouble(entrada.nextLine());

        montoConDesc = montoSinDesc*0.85;

        System.out.printf("\n\t El monto con el 15%c de descuento es: $ %.2f",'%',montoConDesc);

        entrada.close();

    }

}
