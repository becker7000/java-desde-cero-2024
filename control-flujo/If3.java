import javax.swing.*;

public class If3 {

    public static void main(String[] args){

        String telefono;
        telefono = JOptionPane.showInputDialog("Escribe tu teléfono");

        if(telefono.length()==10){
            JOptionPane.showMessageDialog(
                    null,
                    "El teléfono tiene 10 dígitos",
                    "Télefono aceptado",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    "El téfono debe tener 10 dígitos",
                    "Error de entrada de datos",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }

}
