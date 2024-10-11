import java.util.Arrays;
import java.util.List;

public class StreamsTest2 {

    public static void main(String[] args) {

        List<Integer> edades = Arrays.asList(19,23,22,28,18,20,32,29);
        int sumaEdades = edades.stream().mapToInt(Integer::intValue).sum();
        double promedio = (double) sumaEdades/edades.size();

        System.out.printf("\n\t La suma total de edades es: %d",sumaEdades);
        System.out.printf("\n\t El promedio de la edades es: %.3f",promedio);

    }

}
