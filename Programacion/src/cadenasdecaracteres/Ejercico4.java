package cadenasdecaracteres;

import java.util.Scanner;

public class Ejercico4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ('fin' para finalizar)");
        boolean fin = false;

        do {
            String palabra = sc.nextLine();
            if ("fin".equalsIgnoreCase(palabra)) {
                fin = true;
                System.out.println("Fin");

            } else {
                for (int i = 1; i < palabra.length(); i++) {
                    System.out.println(palabra.substring(0, i));

                }
            }
        } while (!fin);
        sc.close();
    }
}
