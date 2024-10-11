import java.util.Scanner;

public class TernarioTest {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.print("\n\t Escribe tu edad: ");
        edad = Integer.parseInt(entrada.nextLine());

        String respuesta = edad >= 18 ? "MAYOR" : "MENOR" ;

        System.out.printf("\n\t Eres %s de edad",respuesta);

        entrada.close();

    }

}
