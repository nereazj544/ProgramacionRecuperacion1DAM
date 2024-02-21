package EjercicosBasicos;

import java.util.Scanner;

public class Ejercico18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce edades (numero negativo para terminar)");
        int edad;
        int suma = 0;
        int ContA = 0;
        int ContAM = 0;

        do {
            edad = sc.nextInt();
            if (edad >=0 ) {
                suma += edad;
                ContA++;
                if (edad > 18) {
                    ContAM++;
                }
            }
        } while (edad >=0);

        if (ContA > 0) {
            double media = suma/ContA;
            
            System.out.println("La media de las edades es: " + media);
            System.out.println("el numero de alumnos con más de 18 años es: " + ContAM);
            System.out.println("La suma de las edades es: " + suma);


        }else{
            System.err.println("Fck");
        }
        sc.close();
    }
}
