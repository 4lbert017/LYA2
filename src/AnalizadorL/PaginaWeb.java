package AnalizadorL;

import java.util.ArrayList;
import java.util.regex.*;

public class PaginaWeb {
     public static void main(String[] args) {
        String texto = "Este es un texto de ejemplo que contiene algunas direcciones de paginas web. "
                + "Puedes encontrar URLs como https://www.ejemplo.com, http://www.otra-url.com, o "
                + "incluso www.sitio-web.org. Recuerda que las URLs pueden contener letras, números y "
                + "caracteres especiales como guiones y puntos. También pueden tener extensiones como "
                + ".html o .php.";

        ArrayList<String> urls = extractURLs(texto);

        System.out.println("URLs encontradas:");
        for (String url : urls) {
            System.out.println(url);
        }
    }

    public static ArrayList<String> extractURLs(String texto) {
        ArrayList<String> urls = new ArrayList<>();
        
        // Expresión regular corregida
        String regex = "(https?://)?(www\\.)?[a-zA-Z0-9\\-]+(\\.[a-zA-Z]+)+(/[a-zA-Z0-9\\-._~:/?#\\[\\]@!$&'()*+,;=]*)?";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        while (matcher.find()) {
            String url = matcher.group();
            urls.add(url);
        }
        
        return urls;
    }
}