import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

public class ConsumerTest1 {

    public static void main(String[] args) {

        Consumer<Date> formateador = fecha -> {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println("\n\t Fecha: "+formato.format(fecha));
        };
        formateador.accept(new Date());

    }

}
