import servicio.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        double x = 5.6, y=3.5;

        Calculadora suma = (a,b) -> a+b;
        Calculadora resta = (a,b) -> a-b;
        Calculadora multiplicacion = (a,b) -> a*b;
        Calculadora division = (a,b) -> b==0 ? 0.0 : a/b;

        System.out.printf("\n\t La suma de %.2f + %.2f = %.2f",x,y,suma.operar(x,y));
        System.out.printf("\n\t La resta de %.2f - %.2f = %.2f",x,y,resta.operar(x,y));
        System.out.printf("\n\t La multiplicación de %.2f * %.2f = %.2f",x,y,multiplicacion.operar(x,y));
        System.out.printf("\n\t La división de %.2f / %.2f = %.2f",x,y,division.operar(x,y));

        System.out.println();
    }

}
