import servicio.Saludo;

import java.util.Locale;

public class SaludoTest {

    public static void main(String[] args) {

        Saludo saludo = nombre -> "Hola "+nombre;
        System.out.println("\n\t "+saludo.generarSaludo("Erick"));

        saludo = nombre -> "Bienvenid@ "+
                nombre.toUpperCase(Locale.ROOT)+
                " a la programación funcional";
        System.out.println("\n\t "+saludo.generarSaludo("Erick"));

    }

}
