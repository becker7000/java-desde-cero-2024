import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entero;
        long factorial=1L;

        System.out.print("\n\t Calcular el factorial de: ");
        entero = Integer.parseInt(entrada.nextLine());

        for(int i=entero; i>=1; i--){
            factorial*=i;
        }

        System.out.printf("\n\t %d! = %d",entero,factorial);

        entrada.close();

    }

}

// 4! = 4*3*2*1 = 24
// 5! = 5*4*3*2*1 = 120

//    -3,-2,-1,0,1,2,3

/*

    14  31  92
    17  45  30
    28  67  43

 */