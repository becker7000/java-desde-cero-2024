public class FiguraTest {

    public static void main(String[] args) {

        // Objetos interfaz:
        Figura figura1 = new Rombo(6,10);
        Figura figura2 = new TrianguloRectangulo(12,8);

        System.out.printf("\n\t El área del rombo es: %.3f",figura1.calcularArea());
        System.out.printf("\n\t El área del tríangulo rectángulo es: %.3f",figura2.calcularArea());

        Figura rectangulo = new Figura() {
            @Override
            public double calcularArea() {
                return 50;
            }
        };

        System.out.printf("\n\t El área del rectángulo es: %.3f",rectangulo.calcularArea());

    }

}
