public class Deportista extends Persona {

    private String deporte;

    public Deportista(String nombre,String telefono,String deporte){
        super(nombre,telefono);
        this.deporte = deporte;
    }

    public String getDeporte(){
        return deporte;
    }

    public void setDeporte(String deporte){
        this.deporte = deporte;
    }

    @Override
    public void mostrar(){
        System.out.printf(
                """
                    +----- DEPORTISTA -----+
                    | Nombre: %s
                    | Teléfono: %s
                    | Deporte: %s
                    +----------------------+
                """,nombre,telefono,deporte
        );
    }

}
