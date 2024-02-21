package EjercicosBasicos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Nerea, 19 años. \n");
        /*
         * * Otra variante de este ejercico.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        sc.close();
        System.out.println("Nombre: " + nombre + ", edad: " + edad + ".");

    }
}
