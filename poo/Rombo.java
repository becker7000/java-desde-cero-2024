public class Rombo implements Figura {

    private double diagonalMenor;
    private double diagonalMayor;
    private String color;

    public Rombo(double diagonalMenor, double diagonalMayor){
        this.diagonalMenor = diagonalMenor;
        this.diagonalMayor = diagonalMayor;
        this.color = "Amarillo";
    }

    // TODO: getter y setter
    public String getColor(){
        return color;
    }

    @Override
    public double calcularArea(){
        double area;
        area = (diagonalMenor*diagonalMayor)/2;
        return area;
    }

}
