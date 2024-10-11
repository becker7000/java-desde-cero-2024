public class Moneda {

    public static void main(String[] args){

        // 0.000000 y 0.999999
        // 0.000000 y 1.999998
        int moneda = (int)(Math.random()*2);

        //System.out.println("\n\t Moneda: "+moneda);
        if(moneda==0){
            System.out.println("\n\t SOOOOL!");
        }else{
            System.out.println("\n\t AGUILAAA!");
        }

    }

}
