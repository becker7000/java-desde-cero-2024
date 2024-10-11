public class MetodosTest {

    public static void saludar(){
        System.out.println("\n\t Hola a todos desde un método...");
    }

    public static void saludarA(String nombre){
        System.out.println("\n\t Bienvenid@ "+nombre);
    }

    public static int sumar(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        saludar();
        saludarA("Erick");
        saludarA("Laura");

        int resultado = sumar(566,182);
        System.out.printf("\n\t El resultado es: %d \n",resultado);

    }

}
