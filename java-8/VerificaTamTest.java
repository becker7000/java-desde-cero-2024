import servicio.VerificadorTam;

import java.util.Scanner;

public class VerificaTamTest {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        VerificadorTam verificadorTam = (cadena,longitud) -> cadena.length()==longitud;

        System.out.print("\n\t Escribe tu teléfono a 10 dígitos: ");
        String telefono = entrada.nextLine();

        if(verificadorTam.verificar(telefono,10)){
            System.out.println("\n\t Teléfono válido...");
        }else{
            System.out.println("\n\t Teléfono no válido...");
        }


        entrada.close();

    }

}
