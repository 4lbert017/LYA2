package AnalizadorL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionCorreo {
    public static void main(String[] args) {
        String email = "carlosalbertocarrillosolano@gmail.";
        String regex = "^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.-]?[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("La direccion de correo electronico es valida.");
        } else {
            System.out.println("La direccion de correo electronico no es valida.");
        }
    }
}
