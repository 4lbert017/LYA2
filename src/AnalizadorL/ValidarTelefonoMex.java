package AnalizadorL;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarTelefonoMex {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero de telefono en el formato de Mexico : ");
        String telefono = scanner.nextLine();

        if (validarTelefonoMexico(telefono)) {
            System.out.println("El numero de telefono es valido en el formato de Mexico.");
        } else {
            System.out.println("El numero de telefono no es valido en el formato de Mexico.");
        }
    }

    public static boolean validarTelefonoMexico(String telefono) {
        // Expresión regular para validar números de teléfono en el formato de México
        String regex = "(\\(\\d{2,3}\\)\\s?\\d{3,4}-\\d{4})";

        // Compilar la expresión regular en un patrón
        Pattern pattern = Pattern.compile(regex);

        // Realizar la validación
        Matcher matcher = pattern.matcher(telefono);
        return matcher.matches();
    }
}