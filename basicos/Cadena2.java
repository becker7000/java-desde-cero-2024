import javax.swing.*;

public class Cadena2 {

    public static void main(String[] args){

        String password = "java12345";
        String pass_user;

        pass_user = JOptionPane.showInputDialog("Escribe la contraseña");

        System.out.println("\n\t La contraseña es vacía? R: "+pass_user.isEmpty());
        System.out.println("\n\t La contraseña son espacios en blanco? R: "+pass_user.isBlank());
        System.out.println("\n\t La contraseña es correcta? R: "+pass_user.equals(password));

    }

}
