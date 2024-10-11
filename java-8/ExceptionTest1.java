public class ExceptionTest1 {

    public static void main(String[] args) {

        String sueldoCadena = "40000";
        double sueldoNumero;

        try{ // Se intenta ejecutar esto:
            sueldoNumero = Double.parseDouble(sueldoCadena);
            System.out.printf("\n\t El sueldo es: $ %.2f", sueldoNumero);
        }catch (NumberFormatException exception){
            System.out.print("\n\t Error en el tipo de dato");
            System.out.println("\n\t Mensaje: "+exception.getMessage());
        }finally { // Se ejecuta suceda o no la Exception
            System.out.println("\n\t Fin del programa...");
        }

    }

}
