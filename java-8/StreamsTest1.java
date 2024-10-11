import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest1 {

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList(
                "Pedro","Maria","Antonio","Eder","Luisa",
                "Osvany","Ana", "Arely","Julia","Alberto"
        );
        System.out.println("\n\t Nombres: "+nombres);

        // Redicción
        List<String> nombresQueInicianConA = nombres.stream()
                .filter(nombre -> nombre.startsWith("A")).toList();
        System.out.println("\n\t Nombres que inician con A: "+nombresQueInicianConA);

        // Mapeo
        // Con lambda: nombre -> nombre.length()
        List<Integer> longitudes = nombres.stream().map(String::length).toList();
        System.out.println("\n\t Longitudes de los nombres: "+longitudes);

    }

}
