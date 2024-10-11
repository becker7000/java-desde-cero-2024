import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class SistemaSolar {

    public static void main(String[] args) {

        String[] planetas = new String[]{
                "Mercurio",
                "Venus",
                "Tierra",
                "Marte",
                "Jupiter",
                "Saturno",
                "Urano",
                "Plutón"
        };

        System.out.println("\n\t Primer elemento: "+planetas[0]);
        planetas[7] = "Neptuno"; // Modificando un valor
        System.out.println("\n\t Ultimo elemento: "+planetas[planetas.length-1]);

        // Da un error si intentamos acceder a un índice más allá de 7.
        //System.out.println("\n\t Indice 20: "+planetas[20]);

        System.out.println("\n\t Planetas: "+ Arrays.toString(planetas));

        System.out.print("\n\t SISTEMA SOLAR:");
        for(int i=0;i<planetas.length;i++){
            System.out.print("\n\t "+planetas[i]);
        }

        // Este arreglo contará con 10 elementos.
        String[] satelites = new String[10];
        satelites[0] = "Luna";

    }

}
