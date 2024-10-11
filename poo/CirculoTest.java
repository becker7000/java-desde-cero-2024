public class CirculoTest {

    public static void main(String[] args) {

        Circulo.cuantosCirculosHay();

        Circulo circulo1 = new Circulo(17.9);
        System.out.print(circulo1);
        System.out.printf("\n\t El área 1 es: %.3f",circulo1.calcularArea());

        Circulo.cuantosCirculosHay();

        Circulo circulo2 = new Circulo(24.67);
        System.out.print(circulo2);
        System.out.printf("\n\t El área 2 es: %.3f",circulo2.calcularArea());

        System.out.printf("\n\t La suma de las áreas 1 y 2: %.3f",circulo1.sumarAreaCon(circulo2));

        Circulo.cuantosCirculosHay();

        Circulo circulo3 = new Circulo();
        System.out.print(circulo3);

        Circulo.cuantosCirculosHay();

        Circulo circulo4CopiaDe1 = new Circulo(circulo1);
        System.out.print(circulo4CopiaDe1);

        Circulo.cuantosCirculosHay();

        double areaDeUnRombo = 491.023;
        System.out.printf("\n\t La suma de áreas 2 con la de un rombo es: %.3f",
                circulo2.sumarAreaCon(areaDeUnRombo));

        System.out.println();

    }

}
