package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce nombre separados por una coma\n");
        String texto = sc.nextLine();

        String expersionregular = "([A-Z][a-z]+(\\\\s[A-Z][a-z]+)*)";
        // ! Expresion significado:
        /*
         * [A-Z]: Coincide con una letra mayúscula al comienzo del nombre.
         * [a-z]+: Coincide con una o más letras minúsculas que siguen a la primera
         * letra.
         * (\\s[A-Z][a-z]+)*: Coincide con un espacio seguido de otra letra mayúscula y
         * una o más letras minúsculas, todo el conjunto es opcional y puede aparecer
         * cero o más veces.
         */

        // String expersionregular = "([A-Z][a-z]{1,}(\\\\\\\\s[A-Z][a-z]{1,})+)";
        // ! Expresion significado:
        /*
         * [A-Z]: Coincide con una letra mayúscula al comienzo del nombre.
         * [a-z]{1,}: Coincide con una o más letras minúsculas que siguen a la primera
         * letra.
         * (\\\\\\\\s[A-Z][a-z]{1,})+: Coincide con uno o más espacios seguidos de otra
         * letra mayúscula y una o más letras minúsculas.
         * + al final: Indica que el patrón anterior (paréntesis) debe aparecer una o
         * más veces.
         */

        Pattern pattern = Pattern.compile(expersionregular);
        String[] nombres = texto.split(",");

        for (String nombre : nombres) {
            Matcher matcher = pattern.matcher(nombre.trim());
            if (matcher.matches()) {
                System.out.println(nombre.trim());
            }
        }
    }
}
