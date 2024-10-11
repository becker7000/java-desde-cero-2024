public class ClinicaTest {

    public static void main(String[] args) {

        // Objetos de las subclase Medico y Deportista

        Persona medico1 = new Medico("Eduardo","5581726354","Cardiología");
        Persona medico2 = new Medico("Laura","5501928300","Neurología");
        Persona medico3 = new Medico("Pedro","7781728855","Cirujano");

        Persona depor1 = new Deportista("Zeus","7781762332","Natación");
        Persona depor2 = new Deportista("Daniela","5571625342","Atletismo");
        Persona depor3 = new Deportista("Vania","7781990002","Tenis");

        // Usando un método polimorfico

        medico1.mostrar();
        medico2.mostrar();
        medico3.mostrar();

        depor1.mostrar();
        depor2.mostrar();
        depor3.mostrar();


    }

}
