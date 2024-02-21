package EjercicosBasicos;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce a: ");
        double a = sc.nextDouble();
        System.out.println("Introduce b: ");
        double b = sc.nextDouble();
        System.out.println("Introduce c: ");
        double c = sc.nextDouble();
        sc.close();

        double ecuacion = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("La ecuacion no es de segundo grhando. (A = 0)");
        } else if (ecuacion > 0) /* Varias soluciones */ {
            double x1 = (-b + Math.sqrt(ecuacion)) / (2 * a);
            double x2 = (-b - Math.sqrt(ecuacion)) / (2 * a);
            System.out.println("Esta ecuacion tiene varias soluciones");
            System.out.println("resultado x1: " + x1);
            System.out.println("resultado x2: " + x2);
        } else if (ecuacion == 0) /* Unica solucion */ {
            double x = -b / (2 * a);
            System.out.println("Solo tiene un resultado posible: ");
            System.out.println("Resultado de X: " + x);
        } else {
            System.out.println("La ecuacion no tiene soluciones reales (resultado negativo).");
        }

    }
}
