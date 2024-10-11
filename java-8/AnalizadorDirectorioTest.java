import modelo.AnalizadorDirectorio;

import java.io.File;
import java.util.List;
import java.util.function.Consumer;

public class AnalizadorDirectorioTest {

    public static void main(String[] args) {

        String directorio = "C:\\Users\\becke\\Documents\\TecGurus\\java-desde-cero\\codigos\\java-8";
        AnalizadorDirectorio analizadorDirectorio = new AnalizadorDirectorio(directorio);

        Consumer<String> mostrarDatos = ruta -> {
            File archivo = new File(ruta);
            System.out.printf("\n\t >> Archivo: %s | Tamaño: %d bytes",
                    archivo.getName(),archivo.length());
        };

        // Guardamos la lista de rutas
        List<String> rutasArchivos = analizadorDirectorio.obtenerRutasDeArchivos();
        rutasArchivos.forEach(mostrarDatos);

    }

}
