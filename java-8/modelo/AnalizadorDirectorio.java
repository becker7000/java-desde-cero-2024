package modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AnalizadorDirectorio {

    private String directorio;

    public AnalizadorDirectorio(String directorio){
        this.directorio = directorio;
    }

    public String getDirectorio(){
        return directorio;
    }

    public void setDirectorio(String directorio){
        this.directorio = directorio;
    }

    public List<String> obtenerRutasDeArchivos(){

        // Creamos un archivo para guardar la carpeta:
        File carpeta = new File(directorio);
        List<String> rutasDeArchivos = new ArrayList<>();

        // Validamos si el archivo directorio es un directorio
        if(carpeta.isDirectory()){
            // Obtenermos la lista de archivos:
            File[] archivos = carpeta.listFiles();

            for(File archivo : archivos){
                rutasDeArchivos.add(archivo.getAbsolutePath());
            }
        }else {
            System.out.println("\n\t Error, el nombre del directorio no es válido...");
        }
        return rutasDeArchivos;
    }

}
