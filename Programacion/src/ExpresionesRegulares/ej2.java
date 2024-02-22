package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce fechas: \n");
        String fecha = sc.nextLine();

        String expresionregular = "^(0[1-9]|[1-2][0-9]|3[01])-(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)-\\d{4}$";

        Pattern pattern = Pattern.compile(expresionregular, Pattern.CASE_INSENSITIVE);
        String[] fechas = fecha.split(",");
        for (String date : fechas) {
            Matcher matcher = pattern.matcher(date.trim());
            if (matcher.matches()) {
                System.out.println(date.trim() + " es una fecha correcta.");
            }else{
                System.out.println(date.trim() + " no es una fecha correcta.");
            }
        }
    }
}
