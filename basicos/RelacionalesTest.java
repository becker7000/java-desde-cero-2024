public class RelacionalesTest {

    public static void main(String[] args){

        boolean resultado;
        int a = 20;
        int b = 10;

        resultado = (a==10) == (b==15);
        // 20>10 == 10<10
        // TRUE == FALSE <=> FALSE
        // FALSE, FALSE, TRUE, FALSE, TRUE

        System.out.printf("\n\t El resultado es: %B",resultado);

    }

}
