public class PlanetaTest {

    public static void main(String[] args) {

        // Objetos de la clase Planeta (instancias)
        Planeta planeta1 = new Planeta("Mercurio","Arena",1);
        Planeta planeta2 = new Planeta("Venus","Anaranjado",2);
        Planeta planeta3 = new Planeta("Tierra","Azul",3);
        Planeta planeta4 = new Planeta("Marte","Rojo",4);

        // Se debe evitar:
        // planeta1.nombre = "Jupiter";

        // Usando un  getter: (Obteniendo un valor)
        // String nombre1 = planeta1.getNombre();
        System.out.printf("\n\t Nombre del primer planeta: %s \n",planeta1.getNombre());

        // Usando un setter: (Modificando un valor)
        planeta1.setColor("Amarillo");

        // Usando un método personalizado:
        planeta1.mostrar();
        planeta2.mostrar();
        planeta3.mostrar();
        planeta4.mostrar();


    }

}
