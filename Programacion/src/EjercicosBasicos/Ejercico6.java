package EjercicosBasicos;

import java.util.Scanner;

public class Ejercico6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular area y perimetro de un circulo");
        System.out.println("Radio del Circulo: (Con decimales hay que poner ',' no '.')");
        double r = sc.nextDouble();
        
        System.out.println("Radio del Circulo: " + r);
        
        //Area del circulo
        double Ar = Math.PI * Math.pow(r, 2);
        System.out.println("Area del circulo: " + Ar);
        
        //Perimetro del circulo
        double Pr = 2 * Math.PI * r;
        System.out.println("Perimetro del circulo: " + Pr + "\n");
        
        /*
         * TRIANGULO
         */
        System.out.println("Calcular area y perimetro de un triangulo");
        System.out.println("Lado 1 del triangulo: ");
        double l1 = sc.nextDouble();
        System.out.println("Lado 1 del triangulo: " + l1);

        System.out.println("Lado 2 del triangulo: ");
        double l2 = sc.nextDouble();
        System.out.println("Lado 2 del triangulo: " + l2);
        
        
        System.out.println("Base del triangulo: ");
        double baseT = sc.nextDouble();
        System.out.println("Base del triangulo: " + baseT);

        System.out.println("Altura del triangulo: ");
        double alturaT = sc.nextDouble();
        System.out.println("Altrua del triangulo: " + alturaT);

        
        double At = (baseT * alturaT) / 2;
        System.out.println("Aera del triangulo: " + At);
        double Pt = l1 + l2 + baseT;
        System.out.println("Perimetro del triangulo: " + Pt + "\n");

        /*
         * Cuadrado
         */

        System.out.println("\nCalcular area y perimetro de un cuadraro");

        System.out.println("Lado 1 del cuadrado: ");
        double lado1 = sc.nextDouble();
        System.out.println("Lado 1 del cuadrado: " + lado1);

        System.out.println("Lado 2 del cuadrado: ");
        double lado2 = sc.nextDouble();
        System.out.println("Lado 2 del cuadrado: " + lado2);

        double Ac = lado1 * lado2;
        System.out.println("Aera del cuadrado: " + Ac);
        double Pc = 4 * lado1;
        System.out.println("Perimetro del cuadrado: " + Pc + "\n");
        
        /*
         * Rectangulo
         */
        System.out.println("\nCalcular area y perimetro de un rectangulo");

        System.out.println("Lado 1 del rectangulo: ");
        double lado1Rec = sc.nextDouble();
        System.out.println("Lado 1 del rectangulo: " + lado1Rec);

        System.out.println("Lado 2 del rectangulo: ");
        double lado2rec = sc.nextDouble();
        System.out.println("Lado 2 del rectangulo: " + lado2rec);

        double Arec = lado1Rec * lado2rec;
        System.out.println("Aera del rectangulo: " + Arec);
        double Prec = 2 * (lado1Rec + lado2rec);
        System.out.println("Perimetro del rectangulo: " + Prec+ "\n");
        
        
        sc.close();
    }
}
