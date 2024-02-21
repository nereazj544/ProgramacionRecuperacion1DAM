package EjercicosBasicos;

import java.util.Scanner;

public class Ejercico3 {
    public static void main(String[] args) {
        double euros = 3;
        double dolares = 1.10;
        double D = euros * dolares;

        // no se cuantos decimales tiene
        System.out.println("\ncantidad en dolares: " + D + "\n");
        
        // Solo con dos decimales
        System.out.printf("cantidad en dolares: %.2f ", D, "\n");
        System.out.println("\n");

        // Meter datos por consola
        System.out.println("\nIntruduce un numero: ");
        Scanner sc = new Scanner(System.in);
        double e = sc.nextInt();
        sc.close();
        double d = 1.10;
        double Dd = e * d;

        // no se cuantos decimales tiene
        System.out.println("\ncantidad en dolares: " + Dd + "\n");
        // Solo con dos decimales
        System.out.printf("cantidad en dolares: %.2f ", Dd);

    }
}
