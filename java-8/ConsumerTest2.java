import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest2 {

    public static void main(String[] args) {

        // Forma #1: usando una lambda:
        //Consumer<String> imprimir = mensaje -> System.out.println(mensaje);

        // Forma #2: usando el operador de resolución de alcance (referencia a un método)
        Consumer<String> imprimir = System.out::println;
        imprimir.accept("Hola a todos desde un objeto de la clase Consumer");

        System.out.println("\nLista de personas: ");
        List<String> personas = Arrays.asList("Jorge","Laura","Vania","Alejandro","Arely","Eduardo");
        personas.forEach(imprimir);

    }

}
