import java.util.Arrays;

public class OrdenamientoPorBurbuja {

    public static void main(String[] args) {

        int[] enteros = new int[20];

        // Algoritmo para llenar el arreglo con números aleatorios.
        for(int i=0;i<enteros.length;i++){
            enteros[i] = (int)(Math.random()*61)+20;
        }
        System.out.print("\n\t Arreglo sin ordenar: "+Arrays.toString(enteros));

        // Algoritmo de ordenamiento por el método de la burbuja:
        for(int i=0;i<enteros.length-1;i++){ // # de pasadas:
            for(int j=0;j<enteros.length-1-i;j++){ // Comparaciones
                if(enteros[j]>enteros[j+1]){ // ASC >, DESC <
                    int aux = enteros[j];
                    enteros[j]=enteros[j+1];
                    enteros[j+1]=aux;
                }
            }
        }// Otros algoritmos: selección y inserción
        System.out.print("\n\t Arreglo ordenado: "+Arrays.toString(enteros));
    }

}

/*
    8,4,7,3,2,1  -> #elementos: 6, #comparaciones: 5

    pasada #0: (#comp:5) (6-1-0 = 5)
    4,8,7,3,2,1
    4,7,8,3,2,1
    4,7,3,8,2,1
    4,7,3,2,8,1
    4,7,3,2,1,8

    pasada #1: (#comp:4) (6-1-1=4)
    4,7,3,2,1,8
    4,3,7,2,1,8
    4,3,2,7,1,8
    4,3,2,1,7,8

    pasada #2: (#comp:3) (6-1-2=3)
    3,4,2,1,7,8
    3,2,4,1,7,8
    3,2,1,4,7,8

    pasada #3: (#comp:2)
    2,3,1,4,7,8
    2,1,3,4,7,8

    pasada #4: (#comp:1)
    1,2,3,4,7,8

 */
