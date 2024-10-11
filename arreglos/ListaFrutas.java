import java.util.ArrayList;
import java.util.Locale;

public class ListaFrutas {

    public static void main(String[] args) {

        // Lista de objetos de la clase String
        ArrayList<String> listaFrutas = new ArrayList<>();

        // Agregando 5 frutas.
        listaFrutas.add("Sandía");
        listaFrutas.add("Melón");
        listaFrutas.add("Kiwi");
        listaFrutas.add("Mango");
        listaFrutas.add("Fresa");

        // Mostrando la lista:
        System.out.println(listaFrutas);

        // Eliminando una fruta:
        listaFrutas.remove(2);

        System.out.println(listaFrutas);

        // Accediendo al tamaño:
        System.out.print("\n\t Tamaño de la lista: "+listaFrutas.size());

        // Mostrando la primera fruta:
        System.out.print("\n\t Primer fruta: "+listaFrutas.get(0));

        // Obteniendo un índice:
        System.out.println("\n\t El indice de 'mango' es: "+listaFrutas.indexOf("Mango"));

        // Insertando una fruta:
        listaFrutas.add(2,"Naranja");

        // Usando foreach para recorrer la lista:
        System.out.print("\n\t LISTA DE FRUTAS:");
        for(String fruta : listaFrutas){
            System.out.print("\n\t "+fruta.toLowerCase(Locale.ROOT));
        }

        System.out.println();

    }

}
