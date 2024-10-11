public class TrianguloRectangulo implements Figura{

    private double base;
    private double altura;
    private String color;

    public TrianguloRectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.color = "Azul";
    }

    public String getColor(){
        return color;
    }

    @Override
    public double calcularArea(){
        double area;
        area = (base*altura)/2;
        return area;
    }

}
