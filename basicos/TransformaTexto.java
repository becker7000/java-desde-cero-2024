import java.util.Locale;

public class TransformaTexto {

    public static void main(String[] args){

        String textoMin = "hola a todos desde una string";
        String textoMay = textoMin.toUpperCase(Locale.ROOT);

        System.out.printf("\n\t Mensaje en minúsculas: %s",textoMin);
        System.out.printf("\n\t Mensaje en mayúsculas: %s",textoMay);

    }

}
