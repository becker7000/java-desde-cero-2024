import java.util.Scanner;

public class CalculadoraConsumoElectrico {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        final double TARIFA1 = 1.2;
        final double TARIFA2 = 1.5;
        final double TARIFA3 = 1.8;
        double consumo;
        double tarifa;
        double montoPagar;

        System.out.print("\n\t Escribe tu consumo eléctrico (kWh): ");
        consumo = Double.parseDouble(entrada.nextLine());

        if(consumo<800){
            tarifa = TARIFA1;
        }else if(consumo<=1450){
            tarifa = TARIFA2;
        }else{
            tarifa = TARIFA3;
        }

        montoPagar = tarifa*consumo;

        System.out.printf(
                """
                    +--------------------------------+
                    | Reporte del consumo eléctrico  
                    | Tu consumo es: %.3f kWh
                    | Tarifa: $ %.2f por kWh
                    | Monto a pagar: $ %.2f
                    +--------------------------------+
                """,consumo,tarifa,montoPagar
        );

        entrada.close();

    }

}
