public class MascotaTest {

    public static void main(String[] args) {

        Mascota mascota1 = new Perro();
        Mascota mascota2 = new Gato();

        System.out.println("\n\t Mascota perro");
        mascota1.hacerSonido();
        mascota1.moverse();

        System.out.println("\n\t Mascota gato");
        mascota2.hacerSonido();
        mascota2.moverse();

    }

}
