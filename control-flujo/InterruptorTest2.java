public class InterruptorTest2 {

    public static void main(String[] args) {

        for(int i=10;i<=30;i++){
            if(i%3==0){
                continue;
            }
            System.out.printf("\n\t i = %d",i);
        }

    }

}
