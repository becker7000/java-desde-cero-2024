public class InterruptorTest1 {

    public static void main(String[] args) {

        int i=1;

        while(i<=10){
            if(i==4 || i==9){
                i++;
                continue;
            }
            System.out.printf("\n\t i = %d",i);
            i++;
        }

    }

}
