import java.util.*;

public class ListTest {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>(
                Arrays.asList("Carlos","Ana","Laura","Alvin","Pedro","Maria","Antonio","Arely")
        );
        System.out.println("\n\t Nombres: "+nombres);

        // Eliminamos nombres bajo una condición:
        nombres.removeIf(nombre -> nombre.startsWith("A"));
        System.out.println("\n\t Nombres: "+nombres);

        // Transformando todas las cadenas a mayusculas:
        nombres.replaceAll(String::toUpperCase);
        System.out.println("\n\t Nombres: "+nombres);

        // Ordenando los nombres en forma ascendente:
        Collections.sort(nombres);
        System.out.println("\n\t Nombres: "+nombres);

        // Ordenando los nombre en forma descendente:
        nombres.sort(Collections.reverseOrder());
        System.out.println("\n\t Nombres: "+nombres);


    }

}
