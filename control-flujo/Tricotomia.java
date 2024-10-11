import java.util.Scanner;

public class Tricotomia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int entero;

        System.out.print("\n\t Escribe un entero: ");
        entero = Integer.parseInt(entrada.nextLine());

        if(entero>0){
            System.out.println("\n\t POSITIVOOO!");
        }else if(entero<0){
            System.out.println("\n\t NEGATIVOOO!");
        }else {
            System.out.println("\n\t CEROOO!");
        }

        entrada.close();

    }

}
