package EjercicosBasicos;

import java.util.Scanner;


public class Ejercico7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Introducir los datos
        System.out.println("Nm: ");
        double Nm = sc.nextDouble();
        System.out.println("Nm: " + Nm);
        System.out.println("kg: ");
        double kg = sc.nextDouble();
        System.out.println("Kg: " + kg);

        /**
         * ! Lo que no entiendo de este ejercico es que si Nm y Kg hay que escribirlos ya de antemano o como hice.
         */


        System.out.println("Masa 1 y masa 2, distacia entre ellas");

        System.out.println("masa 1: ");
        double m1 = sc.nextDouble();
        System.out.println("masa 1: " + m1);
        System.out.println("masa 2: ");
        double m2 = sc.nextDouble();
        System.out.println("masa 2: " + m2);
        System.out.println("distancia: ");
        double d = sc.nextDouble();
        System.out.println("distancia: " + d);
        sc.close();

        // Formulas
        double G = 6.673 * Math.pow(10, -11) * Math.pow(Nm, 2) / Math.pow(kg, 2);
        System.out.println("Resultado de G = " + G);

        double F = G * m1 * m2 / Math.pow(d, 2);
        System.out.println("Resultado de F = " + F);

    }
}
