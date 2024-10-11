import servicio.TransformaCadena;

import java.util.Locale;

public class TransformaCadenaTest {

    public static void main(String[] args) {

        TransformaCadena transformador = cadena -> cadena.toUpperCase(Locale.ROOT);
        String pais1 = "cAnADa";
        System.out.println("\n\t País 1: "+transformador.transformar(pais1));

        transformador = cadena -> cadena.toLowerCase(Locale.ROOT);
        String pais2 = "fRanCIa";
        System.out.println("\n\t País 2: "+transformador.transformar(pais2));

    }

}
