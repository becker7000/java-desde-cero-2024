public class Circulo {

    // Atributos:
    private double radio;

    // Atributos estático:
    private static int cantidadDeCirculos = 0;

    // Constructor 1 (crea un círculo con un radio configurado):
    public Circulo(double radio) {
        this.radio = radio;
        cantidadDeCirculos++;
    }

    // Constructor 2 (crea un círculo unitario por defecto):
    public Circulo() {
        this.radio = 1.0;
        cantidadDeCirculos++;
    }

    // Constructor 3 (crea una copia de un objeto Circulo)
    public Circulo(Circulo circulo) {
        this.radio = circulo.getRadio();
        cantidadDeCirculos++;
    }

    // Métodos getter y setter:

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método personalizados:

    public double calcularArea() {
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double sumarAreaCon(Circulo circulo) {
        double areaTotal;
        areaTotal = this.calcularArea() + circulo.calcularArea();
        return areaTotal;
    }

    // Sobrecargando el método sumarAreaCon
    public double sumarAreaCon(double area){
        double areaTotal;
        areaTotal = this.calcularArea() + area;
        return areaTotal;
    }

    // Método estático:
    public static void cuantosCirculosHay(){
        System.out.printf("\n\t Hasta el momento hay %d %s",
                cantidadDeCirculos, cantidadDeCirculos==1 ? "círculo":"círculos");
    }

    // Sobreescribiendo el método toString()
    @Override
    public String toString(){
        return String.format("\n\t Circulo { radio: %.2f }",radio);
    }

}
