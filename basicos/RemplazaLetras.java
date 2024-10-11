public class RemplazaLetras {

    public static void main(String[] args){

        String mensaje_cifrado = "Jzvz procesz czdenzs";
        String mensaje_decifrado = mensaje_cifrado.replace('z','a');

        System.out.printf("\n\t Mensaje cifrado: %s",mensaje_cifrado);
        System.out.printf("\n\t Mensaje decifrado: %s",mensaje_decifrado);

    }

}
